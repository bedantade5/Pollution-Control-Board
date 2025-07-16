package com.vig.polutioncontrol.restapi.utility;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import org.springframework.stereotype.Component;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;

@Component
public class AWSFileUploader 
{
	AmazonS3 s3client;
	String bucketName;
	String uploadRootDirectory;
	
	public AWSFileUploader() 
	{
		AWSCredentials credentials = new BasicAWSCredentials("AKIA6ODUZRXO7T7J7WEC", "9NWQDx42epv2OH1ssKWnUXk5/H+hK/R9roXFSFWD");
		
		s3client = AmazonS3ClientBuilder
				  .standard()
				  .withCredentials(new AWSStaticCredentialsProvider(credentials))
				  .withRegion("ap-south-1")
				  .build();
		
		this.bucketName = "prdvbdcp-survey-images";
	}
	
	public String uploadFile(String uploadDirectoryName, String fileName, InputStream fileStream, Integer dataLength) 
	{
		String imageUrl = null;
		
		try 
		{
			ObjectMetadata metadata = new ObjectMetadata();
		    metadata.setContentLength(dataLength);
		    metadata.setContentType("image/png");
		    
			s3client.putObject(new PutObjectRequest(bucketName, uploadDirectoryName +"/" + fileName, fileStream, metadata)
					.withCannedAcl(CannedAccessControlList.PublicRead));
			URL url = s3client.getUrl(bucketName, uploadDirectoryName +"/" + fileName);
			imageUrl = url.toString();
			System.out.println("Image Uploaded : " + url.toString());
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
			imageUrl = null;
		}
		
		return imageUrl;
	} 
}
