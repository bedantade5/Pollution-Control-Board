package com.vig.polutioncontrol.restapi.config;

import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.io.IOUtils;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="myconf",ignoreInvalidFields = true)
public class RsaKeyProperties {
	
	private RSAPublicKey publicKey;
	private RSAPrivateKey privateKey;
	
	public RSAPublicKey getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(RSAPublicKey publicKey) {
		this.publicKey = publicKey;
	}
	public RSAPrivateKey getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(RSAPrivateKey privateKey) {
		this.privateKey = privateKey;
	}
	
	public void loadPublicKey() 
	{
		try 
		{			
			final InputStream inputStream = getClass().getClassLoader().getResourceAsStream("certs/public.pem");
			String privateKeySTr = IOUtils.toString(inputStream, String.valueOf(StandardCharsets.UTF_8));
    	    
			StringReader strReader = new StringReader(privateKeySTr);
			PemReader pemReader = new PemReader(strReader);
	    	PemObject pem = pemReader.readPemObject();
	    	byte[] der = pem.getContent();
	    	pemReader.close();
	    	strReader.close();
	        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
	        //PKCS8EncodedKeySpec ks = new PKCS8EncodedKeySpec(der);
	        X509EncodedKeySpec ks = new X509EncodedKeySpec(der);
	        publicKey = (RSAPublicKey) keyFactory.generatePublic(ks);
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	
	public void loadPrivateKey() 
	{
		try 
		{			
			final InputStream inputStream = getClass().getClassLoader().getResourceAsStream("certs/private.pem");
			String privateKeySTr = IOUtils.toString(inputStream, String.valueOf(StandardCharsets.UTF_8));
    	    
			StringReader strReader = new StringReader(privateKeySTr);
			PemReader pemReader = new PemReader(strReader);
	    	PemObject pem = pemReader.readPemObject();
	    	byte[] der = pem.getContent();
	    	pemReader.close();
	    	strReader.close();
	        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
	        PKCS8EncodedKeySpec ks = new PKCS8EncodedKeySpec(der);
	        privateKey = (RSAPrivateKey) keyFactory.generatePrivate(ks);
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
}
