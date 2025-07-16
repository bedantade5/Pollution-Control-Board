package com.vig.polutioncontrol.common.util;

public class CONSTANTS 
{
	/*========== API Return Status ========================*/
	public static final Integer API_STATUS_SUCCESS 				 	= 0;
	public static final Integer API_STATUS_INVALID_TOKEN 		 	= 1;
	public static final Integer API_STATUS_INVALID_PARAMETER 	 	= 2;
	public static final Integer API_STATUS_INSERT_FAILURE 		 	= 3;
	public static final Integer API_STATUS_GET_FAILURE 			 	= 4;
	public static final Integer API_STATUS_DELETE_FAILURE 		 	= 5;
	public static final Integer API_STATUS_UNAUTHORIZED			 	= 401;
	public static final Integer API_STATUS_NO_DATA_FOUND			= 10;
	
	

	public static final String ITEM_IMAGE_UPLOAD_BASE_PATH = "C:/nkda_survey/survey_images/";
	//public static final String ITEM_IMAGE_UPLOAD_BASE_PATH = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\NKDASAImages\\";
	//public static final String ITEM_IMAGE_UPLOAD_BASE_PATH = "/opt/tomcat/webapps/NKDASAImages/";


	// static final String ITEM_IMAGE_PATH = "http://vct.newtownkolkata.org/NKDASAImages/";
	public static final String ITEM_IMAGE_PATH = "http://115.187.62.16:90/NKDASAImages/";
	
	
	//public static final String baseUrl 	   = "http://115.187.62.16:90/NKDASARestAPI/rs/v1/master";
	//public static final String baseUrlAuth = "http://115.187.62.16:90/NKDASARestAPI/user/auth";
	
	// static final String baseUrl 	   = "http://127.0.0.1/NKDASARestAPI/rs/v1/master";
	//public static final String baseUrlAuth = "http://127.0.0.1/NKDASARestAPI/user/auth";
	
	public static final String baseUrl 	   = "http://127.0.0.1:9998/rs/v1/master";
	public static final String baseUrlAuth = "http://127.0.0.1:9998/user/auth";
	
	//public static final String baseUrl 	   = "http://vct.newtownkolkata.org/NKDASARestAPI/rs/v1/master";
	//public static final String baseUrlAuth = "http://vct.newtownkolkata.org/NKDASARestAPI/user/auth";
	
	public static final String baseUrlGeoJson = "https://prdvbdcp-geo-json.s3.ap-south-1.amazonaws.com";

	public static final String DOC_UPLOAD_BASE_PATH = "C:/monthly_do/Documents/";
	
	public static final String MSG_EXCEPTION_ERROR = "Internal server error, please try again!";
	public static final String MSG_PARAM_INVALID =  "Please Enter Valid Parameters";
	public static final String MSG_TOKEN_GENERATION_SUCCESS ="Token generated successfully";
	public static final String MSG_TOKEN_GENERATION_FAILURE ="Failed to generate Token";
	public static final String MSG_USER_AUTH_REGISTRATION_SUCCESS ="User Auth registered successfully";
	public static final String MSG_USER_AUTH_REGISTRATION_FAILURE ="Failed to register User Auth";
	public static final String MSG_PASSWORD_RESET_SUCCESS ="Password reset successfully";
	public static final String MSG_PASSWORD_RESET_FAILURE ="Failed to reset Password";
	public static final String MSG_OTP_GENERATION_SUCCESS ="OTP generated successfully";
	public static final String MSG_OTP_GENERATION_FAILURE ="Failed to generate OTP";
	public static final String MSG_OTP_VALIDATION_SUCCESS ="OTP validated successfully";
	public static final String MSG_OTP_VALIDATION_FAILURE ="Invalid OTP";
	public static final String MSG_PENDING_CHALLAN_FETCH_SUCCESS ="Pending Challan Details fetched successfully";
	public static final String MSG_PENDING_CHALLAN_FETCH_FAILURE ="Failed to fetch Pending Challan Details";
	public static final String MSG_API_SEARCH_LOG_FETCH_SUCCESS ="API Search Log fetched successfully";
	public static final String MSG_API_SEARCH_LOG_FETCH_FAILURE ="Failed to fetch API Search Log";
	public static final String MSG_OTP_EXPIRED ="OTP expired";
	public static final String MSG_REMOVE_USER_AUTH_SUCCESS ="User Auth Remove successfully";
	public static final String MSG_REMOVE_USER_AUTH_FAILURE ="Failed to Remove User Auth";
	public static final String MSG_REMOVE_WEB_USER_SUCCESS ="Web User Remove successfully";
	public static final String MSG_USERID_DOSE_NOT_EXISTS ="Web User ID dose't exists";
	public static final String MSG_REMOVE_WEB_USER_FAILURE ="Failed to Remove Web User";
	public static final String MSG_WEB_USER_SAVE_SUCCESSFULLY ="Web User save successfully";
	public static final String MSG_WEB_USER_SAVE_FAILURE ="Failed to save Web User";
	public static final String MSG_WEB_USER_FETCH_SUCCESS ="Web User Fetch successfully";
	public static final String MSG_WEB_USER_FETCH_FAILURE ="Failed to Fetch Web User";
	public static final String MSG_JWT_USER_FETCH_SUCCESS ="JWT User Fetch successfully";
	public static final String MSG_JWT_USER_FETCH_FAILURE ="Failed to Fetch JWT User";
	public static final String MSG_LOGIN_SUCCESSFULLY = "Login successfully";
	public static final String MSG_USER_NAME_NOT_EXISTS = "User does not exist";
	public static final String MSG_USER_ALREADY_REGISTERED = "User already registered";
	public static final String MSG_INVALID_USER_TYPE = "Invalid user type";
	public static final String MSG_LOGIN_FAILURE = "Login failure, please try again!";
	public static final String MSG_INCORRECT_PASSWORD = "Incorrect Password / OTP!";
	public static final String MSG_LOGIN_FAILUR_INVALID_CREDENTIAL = "Invalid Credential.";
	public static final String MSG_LOGIN_FAILUR_ACCOUNT_LOCKED = "Account Locked.";
	public static final String MSG_LOGOUT_SUCCESS = "Logout successfully";
	public static final String MSG_LOGOUT_FAILURE = "Failed to Logout.";
	public static final String MSG_HOUSE_SURVEY_INFO_SAVE_SUCCESS = "House Survey Information saved successfully";
	public static final String MSG_HEALTH_MONITORING_SUCCESS = "Api Module Running";
	public static final String MSG_HOUSE_SURVEY_INFO_SAVE_FAILURE = "Failed to save House Survey Information";
	public static final String MSG_STREET_SURVEY_INFO_SAVE_SUCCESS = "Street Survey Information saved successfully";
	public static final String MSG_STREET_SURVEY_INFO_SAVE_FAILURE = "Failed to save Street Survey Information";
	public static final String MSG_ENVIRONMENT_SURVEY_INFO_SAVE_SUCCESS = "Environment Survey Information saved successfully";
	public static final String MSG_ENVIRONMENT_SURVEY_INFO_SAVE_FAILURE = "Failed to save Environment Survey Information";
	public static final String MSG_ENVIRONMENT_SURVEY_INFO_GET_SUCCESS = "Environment Survey Information fetched successfully";
	public static final String MSG_ENVIRONMENT_SURVEY_INFO_GET_FAILURE = "Failed to fetch Environment Survey Information";
	public static final String MSG_INVALID_LOCATION = "Incorrect Location Provided";
	public static final String MSG_GEO_LOCATION = "Incorrect Geo Location Provided";
	public static final String MSG_USER_LOGGED_OUT = "User not logged in";
	public static final String MSG_HOUSE_SURVEY_INFO_GET_SUCCESS = "House Survey Information fetched successfully";
	public static final String MSG_HOUSE_SURVEY_INFO_GET_FAILURE = "Failed to fetch House Survey Information";
	public static final String MSG_DASHBOARD_DETAILS_GET_SUCCESS = "Dashboard Details fetched successfully";
	public static final String MSG_DASHBOARD_DETAILS_GET_FAILURE = "Failed to fetch Dashboard Details";
	public static final String MSG_HOUSE_SURVEY_DOC_INFO_SAVE_SUCCESS = "House Survey Document Information saved successfully";
	public static final String MSG_HOUSE_SURVEY_DOC_INFO_SAVE_FAILURE = "Failed to save House Survey Document Information";
	public static final String MSG_ENVIRONMENT_SURVEY_IMG_INFO_SAVE_SUCCESS = "Environment Survey Image Information saved successfully";
	public static final String MSG_ENVIRONMENT_SURVEY_IMG_INFO_SAVE_FAILURE = "Failed to save Environment Survey Image Information";
	public static final String MSG_BOUNDARY_DETAILS_GET_SUCCESS = "Boundary Details fetched successfully";
	public static final String MSG_BOUNDARY_DETAILS_GET_FAILURE = "Failed to fetch Boundary Details";
	public static final String MSG_ENVIRONMENT_PLACES_GET_SUCCESS = "Environment Places fetched successfully";
	public static final String MSG_ENVIRONMENT_PLACES_GET_FAILURE = "Failed to fetch Environment Places";
	public static final String MSG_PENDING_HOUSE_SURVEY_INFO_GET_SUCCESS = "Pending House Survey Information fetched successfully";
	public static final String MSG_PENDING_HOUSE_SURVEY_INFO_GET_FAILURE = "Failed to fetch Pending House Survey Information";
	public static final String MSG_PENDING_ENVIRONMENT_SURVEY_INFO_GET_SUCCESS = "Pending Environment Survey Information fetched successfully";
	public static final String MSG_PENDING_ENVIRONMENT_SURVEY_INFO_GET_FAILURE = "Failed to fetch Pending Environment Survey Information";
	public static final String MSG_HOUSE_SURVEY_SUPERVISOR_ACTION_SAVE_SUCCESS = "House Survey Supervisor Action saved successfully";
	public static final String MSG_HOUSE_SURVEY_SUPERVISOR_ACTION_SAVE_FAILURE = "Failed to save House Survey Supervisor Action Information";
	public static final String MSG_INVALID_HOUSE_SURVEY_ID = "Incorrect House Survey ID Provided";
	public static final String MSG_CUMULATIVE_CASE_ENTRY_INFO_SAVE_SUCCESS = "Cumulative Case Entry Info saved successfully";
	public static final String MSG_CUMULATIVE_CASE_ENTRY_INFO_SAVE_FAILURE = "Failed to save Cumulative Case Entry Info";
	public static final String MSG_CUMULATIVE_CASE_ENTRY_INFO_GET_SUCCESS = "Cumulative Case Entry Info fetched successfully";
	public static final String MSG_CUMULATIVE_CASE_ENTRY_INFO_GET_FAILURE = "Failed to fetch Cumulative Case Entry Info";
	public static final String MSG_ENVIRONMENT_SURVEY_SUPERVISOR_ACTION_SAVE_SUCCESS = "Environment Survey Supervisor Action saved successfully";
	public static final String MSG_ENVIRONMENT_SURVEY_SUPERVISOR_ACTION_SAVE_FAILURE = "Failed to save Environment Survey Supervisor Action Information";
	public static final String MSG_INVALID_ENVIRONMENT_SURVEY_ID = "Incorrect Environment Survey ID Provided";
	public static final String MSG_HOUSE_SURVEY_SUPERVISOR_ACTION_GET_SUCCESS = "House Survey Supervisor Action fetched successfully";
	public static final String MSG_HOUSE_SURVEY_SUPERVISOR_ACTION_GET_FAILURE = "Failed to fetch House Survey Supervisor Action Information";
	public static final String MSG_ENVIRONMENT_SURVEY_SUPERVISOR_ACTION_GET_SUCCESS = "Environment Survey Supervisor Action fetched successfully";
	public static final String MSG_ENVIRONMENT_SURVEY_SUPERVISOR_ACTION_GET_FAILURE = "Failed to fetch Environment Survey Supervisor Action Information";
	public static final String MSG_DISTRICT_DETAILS_GET_FAILURE = "Failed to fetch District details";
	public static final String MSG_DISTRICT_DETAILS_GET_SUCCESS = "District details fetched successfully";
	public static final String MSG_SUB_DIVISION_DETAILS_GET_FAILURE = "Failed to fetch Sub Division details";
	public static final String MSG_SUB_DIVISION_DETAILS_GET_SUCCESS = "Sub Division details fetched successfully";
	public static final String MSG_BLOCK_DETAILS_GET_FAILURE = "Failed to fetch Block details";
	public static final String MSG_BLOCK_DETAILS_GET_SUCCESS = "Block details fetched successfully";
	public static final String MSG_GP_DETAILS_GET_FAILURE = "Failed to fetch Gram Panchayet details";
	public static final String MSG_GP_DETAILS_GET_SUCCESS = "Gram Panchayet details fetched successfully";
	public static final String MSG_USER_TYPE_DETAILS_GET_FAILURE = "Failed to fetch User Type details";
	public static final String MSG_USER_TYPE_DETAILS_GET_SUCCESS = "User Type details fetched successfully";
	public static final String MSG_LOGIN_TYPE_DETAILS_GET_FAILURE = "Failed to fetch Login Type details";
	public static final String MSG_LOGIN_TYPE_DETAILS_GET_SUCCESS = "Login Type details fetched successfully";
	public static final String MSG_SURVEY_COUNT_GP_GET_SUCCESS = "Survey count GP fetched successfully";
	public static final String MSG_SURVEY_COUNT_GP_GET_FAILURE = "Failed to fetch Survey Count GP";
	public static final String MSG_BLOCK_BOUNDARY_GET_SUCCESS = "Block Boundary fetched successfully";
	public static final String MSG_BLOCK_BOUNDARY_GET_FAILURE = "Failed to fetch Block Boundary";
	public static final String MSG_BULK_DENGUE_CASE_SAVE_SUCCESS = "Bulk dengue case saved successfully";
	public static final String MSG_BULK_DENGUE_CASE_SAVE_FAILURE = "Failed to save bulk dengue case";
	public static final String MSG_ENTOMO_STAT_GET_SUCCESS = "Entomo Stats fetched successfully";
	public static final String MSG_ENTOMO_STAT_GET_FAILURE = "Failed to fetch Entomo Stats";
	public static final String MSG_FEVER_CASE_INFO_GET_SUCCESS = "Fever case info fetched successfully";
	public static final String MSG_FEVER_CASE_INFO_GET_FAILURE = "Failed to fetch Fever case info";
	public static final String MSG_SURVEY_COUNT_GET_SUCCESS = "Survey count fetched successfully";
	public static final String MSG_SURVEY_COUNT_GET_FAILURE = "Failed to fetch Survey count";
	public static final String MSG_DENGUE_OCCURANCE_GET_SUCCESS = "Dengue occurance details fetched successfully";
	public static final String MSG_DENGUE_OCCURANCE_GET_FAILURE = "Failed to fetch Dengue occurance details";
	public static final String MSG_WEEKLY_DISEASE_TRENDS_GET_SUCCESS = "Weekly disease trends fetched successfully";
	public static final String MSG_WEEKLY_DISEASE_TRENDS_GET_FAILURE = "Failed to fetch Weekly disease trends";
	public static final String MSG_QUARTERLY_COMPARISON_GET_SUCCESS = "Quarterly comparison fetched successfully";
	public static final String MSG_QUARTERLY_COMPARISON_GET_FAILURE = "Failed to fetch Quarterly comparison";
	public static final String MSG_USER_DETAILS_GET_SUCCESS = "User details fetched successfully";
	public static final String MSG_USER_DETAILS_GET_FAILURE = "Failed to fetch User details";
	public static final String MSG_APPROVE_USER_LOGIN_SAVE_SUCCESS = "User approved successfully";
	public static final String MSG_REJECT_USER_LOGIN_SAVE_SUCCESS = "User rejected successfully";
	public static final String MSG_DELETE_USER_LOGIN_SAVE_SUCCESS = "User deleted successfully";
	public static final String MSG_APPROVE_USER_LOGIN_SAVE_FAILURE = "Failed to approve User";
	public static final String MSG_REVIEW_USER_LOGIN_SAVE_SUCCESS = "User reviewed successfully";
	public static final String MSG_INVALID_PROFILE_ID = "Invalid Profile ID";
	public static final String MSG_INVALID_GP_ID = "Invalid GP ID";
	public static final String MSG_UPDATE_USER_PROFILE_SAVE_SUCCESS = "User profile updated successfully";
	public static final String MSG_UPDATE_USER_PROFILE_SAVE_FAILURE = "Failed to update User profile";
	public static final String MSG_USER_PROFILE_GET_SUCCESS = "User profile fetched successfully";
	public static final String MSG_USER_PROFILE_GET_FAILURE = "Failed to fetch User profile";
	public static final String MSG_TOP_SURVEY_COUNT_GET_SUCCESS = "Top survey count fetched successfully";
	public static final String MSG_TOP_SURVEY_COUNT_GET_FAILURE = "Failed to fetch top survey count";
	public static final String MSG_LOWEST_SURVEY_COUNT_GET_SUCCESS = "Lowest survey count fetched successfully";
	public static final String MSG_LOWEST_SURVEY_COUNT_GET_FAILURE = "Failed to fetch lowest survey count";
	public static final String MSG_HOUSE_SURVEY_SUMMARY_GET_SUCCESS = "House survey summary fetched successfully";
	public static final String MSG_HOUSE_SURVEY_SUMMARY_GET_FAILURE = "Failed to fetch house survey summary";
	public static final String MSG_ENVIRONMENT_SURVEY_SUMMARY_GET_SUCCESS = "Environment survey summary fetched successfully";
	public static final String MSG_ENVIRONMENT_SURVEY_SUMMARY_GET_FAILURE = "Failed to fetch environment survey summary";
	public static final String MSG_VST_SURVEY_INFO_GET_SUCCESS = "Vst survey information fetched successfully";
	public static final String MSG_VST_SURVEY_INFO_GET_FAILURE = "Failed to fetch vst survey information";
	public static final String MSG_APP_USAGE_INFO_GET_SUCCESS = "App usage information fetched successfully";
	public static final String MSG_APP_USAGE_INFO_GET_FAILURE = "Failed to fetch app usage information";
	public static final String MSG_SURVEY_REPORT_FOR_DISTRICT_GET_SUCCESS = "Survey report for district fetched successfully";
	public static final String MSG_SURVEY_REPORT_FOR_DISTRICT_GET_FAILURE = "Failed to fetch survey report for district";
	public static final String MSG_SURVEY_REPORT_FOR_BLOCK_GET_SUCCESS = "Survey report for block fetched successfully";
	public static final String MSG_SURVEY_REPORT_FOR_BLOCK_GET_FAILURE = "Failed to fetch survey report for block";
	public static final String MSG_SURVEY_REPORT_FOR_GP_GET_SUCCESS = "Survey report for gp fetched successfully";
	public static final String MSG_SURVEY_REPORT_FOR_GP_GET_FAILURE = "Failed to fetch survey report for gp";
	public static final String MSG_UNRESOLVED_ISSUES_GET_SUCCESS = "Unresolved Issues fetched successfully";
	public static final String MSG_UNRESOLVED_ISSUES_GET_FAILURE = "Failed to fetch unresolved issues";
	public static final String MSG_UNRESOLVED_HOUSEHOLD_SURVEY_GET_SUCCESS = "Unresolved household survey fetched successfully";
	public static final String MSG_UNRESOLVED_HOUSEHOLD_SURVEY_GET_FAILURE = "Failed to fetch unresolved household survey";
	public static final String MSG_PERENNIAL_BREEDING_SITE_SUMMARY_GET_SUCCESS = "Perennial breeding site summary fetched successfully";
	public static final String MSG_PERENNIAL_BREEDING_SITE_SUMMARY_GET_FAILURE = "Failed to fetch perennial breeding ground summary";
	public static final String MSG_SUPERVISOR_APP_DASHBOARD_GET_SUCCESS = "Supervisor App Dashboard fetched successfully";
	public static final String MSG_SUPERVISOR_APP_DASHBOARD_GET_FAILURE = "Failed to fetch Supervisor App Dashboard";
	public static final String MSG_GP_PROFILE_SAVE_SUCCESS = "GP profile saved successfully";
	public static final String MSG_GP_PROFILE_SAVE_FAILURE = "Failed to save GP profile.";
	public static final String MSG_GP_PROFILE_INFO_GET_SUCCESS = "GP profile info fetched successfully";
	public static final String MSG_GP_PROFILE_INFO_GET_FAILURE = "Failed to fetch GP profile info";
	public static final String MSG_TOP_PERFORMER_GET_SUCCESS = "Top performer fetched successfully";
	public static final String MSG_TOP_PERFORMER_GET_FAILURE = "Failed to fetch top performer";
	public static final String MSG_VBD_WORKER_ATTENDANCE_GET_SUCCESS = "VBD worker attendance fetched successfully";
	public static final String MSG_VBD_WORKER_ATTENDANCE_GET_FAILURE = "Failed to fetch VBD worker attendance";
	public static final String MSG_ATTENDANCE_INFO_SAVE_SUCCESS = "Attendance info saved successfully";
	public static final String MSG_ATTENDANCE_INFO_SAVE_FAILURE = "Failed to save attendance info";
	public static final String MSG_INVALID_ATTENDEE_ID = "Attendee ID does not exist";
	public static final String MSG_APPROVE_ATTENDANCE_STATUS_SAVE_SUCCESS = "Attendance status approved successfully";
	public static final String MSG_APPROVE_ATTENDANCE_STATUS_SAVE_FAILURE = "Failed to approve attendance status";
	public static final String MSG_APPROVE_ATTENDANCE_STATUS_REVIEW_SUCCESS = "Attendance status reviewed successfully";
	public static final String MSG_GS_DETAILS_GET_SUCCESS = "Gram sansad details fetched successfully";
	public static final String MSG_GS_DETAILS_GET_FAILURE = "Failed to fetch gram sansad details";
	public static final String MSG_SURVEY_TYPES_GET_SUCCESS = "All survey types fetched successfully";
	public static final String MSG_SURVEY_TYPES_GET_FAILURE = "Failed to fetch all survey types";
	public static final String MSG_PERIOD_TYPES_GET_SUCCESS = "All period types fetched successfully";
	public static final String MSG_PERIOD_TYPES_GET_FAILURE = "Failed to fetch all period types";
	public static final String MSG_REPORT_GET_SUCCESS = "Report fetched successfully";
	public static final String MSG_REPORT_GET_FAILURE = "Failed to fetch report";
	public static final String MSG_SEQ_NO_GET_SUCCESS = "Sequence number fetched successfully";
	public static final String MSG_SEQ_NO_GET_FAILURE = "Failed to fetch sequence number";
	public static final String MSG_SURVEY_VERIFICATION_INFO_SAVE_SUCCESS = "Survey verification info saved successfully";
	public static final String MSG_SURVEY_VERIFICATION_INFO_SAVE_FAILURE = "Failed to save survey verification info";
	public static final String MSG_VBD_WORKER_INFO_GET_SUCCESS = "VBD worker info fetched successfully";
	public static final String MSG_VBD_WORKER_INFO_GET_FAILURE = "Failed to fetch VBD worker info";
	public static final String MSG_SCHOOL_AWARENESS_ACTIVITY_SAVE_SUCCESS = "School awareness activity saved successfully";
	public static final String MSG_SCHOOL_AWARENESS_ACTIVITY_SAVE_FAILURE = "Failed to save school awareness activity";
	public static final String MSG_SPECIAL_ACTIVITY_IMG_INFO_SAVE_SUCCESS = "Special Activity Image Information saved successfully";
	public static final String MSG_SPECIAL_ACTIVITY_IMG_INFO_SAVE_FAILURE = "Failed to save Special Activity Image Information";
	public static final String MSG_COMMUNITY_AWARENESS_ACTIVITY_SAVE_SUCCESS = "Community awareness activity saved successfully";
	public static final String MSG_COMMUNITY_AWARENESS_ACTIVITY_SAVE_FAILURE = "Failed to save community awareness activity";
	public static final String MSG_MARKET_CLEANLINESS_ACTIVITY_SAVE_SUCCESS = "Market cleanliness activity saved successfully";
	public static final String MSG_MARKET_CLEANLINESS_ACTIVITY_SAVE_FAILURE = "Failed to save market cleanliness activity";
	public static final String MSG_IE_PUBLIC_ACTIVITY_SAVE_SUCCESS = "IE public activity saved successfully";
	public static final String MSG_IE_PUBLIC_ACTIVITY_SAVE_FAILURE = "Failed to save IE public activity";
	public static final String MSG_SPECIAL_CLEANLINESS_ACTIVITY_SAVE_SUCCESS = "Special cleanliness activity saved successfully";
	public static final String MSG_SPECIAL_CLEANLINESS_ACTIVITY_SAVE_FAILURE = "Failed to save special cleanliness activity";
	public static final String MSG_PERENNIAL_BREEDING_CLEANLINESS_ACTIVITY_SAVE_SUCCESS = "Perennial breeding special cleanliness activity saved successfully";
	public static final String MSG_PERENNIAL_BREEDING_CLEANLINESS_ACTIVITY_SAVE_FAILURE = "Failed to save perennial breeding special cleanliness activity";
	public static final String MSG_MAPPING_PERENNIAL_BREEDING_SPOTS_ACTIVITY_SAVE_SUCCESS = "Mapping perennial breeding spots activity saved successfully";
	public static final String MSG_MAPPING_PERENNIAL_BREEDING_SPOTS_ACTIVITY_SAVE_FAILURE = "Failed to save mapping perennial breeding spots activity";
	public static final String MSG_HOUSE_SURVEY_SUPERVISOR_IMG_INFO_SAVE_SUCCESS = "House survey supervisor image information saved successfully";
	public static final String MSG_HOUSE_SURVEY_SUPERVISOR_IMG_INFO_SAVE_FAILURE = "Failed to save house survey supervisor image information";
	public static final String MSG_ENVIRONMENT_SURVEY_SUPERVISOR_IMG_INFO_SAVE_SUCCESS = "Environment survey supervisor image information saved successfully";
	public static final String MSG_ENVIRONMENT_SURVEY_SUPERVISOR_IMG_INFO_SAVE_FAILURE = "Failed to save environment survey supervisor image information";
	public static final String MSG_SURVEY_ON_MAP_GET_SUCCESS = "Survey on map fetched successfully";
	public static final String MSG_SURVEY_ON_MAP_GET_FAILURE = "Failed to fetch survey on map";
	public static final String MSG_ENTOMOLOGICAL_ALERT_SAVE_SUCCESS = "Entomological Alert saved successfully";
	public static final String MSG_ENTOMOLOGICAL_ALERT_SAVE_FAILURE = "Failed to save entomological alert";
	public static final String MSG_ENTOMOLOGICAL_ALERT_GET_SUCCESS = "Entomological Alert info fetched successfully";
	public static final String MSG_ENTOMOLOGICAL_ALERT_GET_FAILURE = "Failed to fetch entomological alert info";
	public static final String MSG_ENTOMOLOGICAL_PRIORITY_GET_SUCCESS = "Entomological priority fetched successfully";
	public static final String MSG_ENTOMOLOGICAL_PRIORITY_GET_FAILURE = "Failed to fetch entomological priority";
	public static final String MSG_PERENNIAL_BREEDING_SITE_GET_SUCCESS = "Perennial breeding site id fetched successfully";
	public static final String MSG_PERENNIAL_BREEDING_SITE_GET_FAILURE = "Failed to fetch perennial breeding site id";
	public static final String MSG_ACTION_AREA_DETAILS_GET_SUCCESS = "Action Area Details fetched successfully";
	public static final String MSG_ACTION_AREA_DETAILS_GET_FAILURE = "Failed to fetch Action Area Details";
	public static final String MSG_HOUSING_COMPLEX_DETAILS_GET_SUCCESS = "Housing Complex details fetched successfully";
	public static final String MSG_HOUSING_COMPLEX_DETAILS_GET_FAILURE = "Failed to fetch Housing Complex details";
	public static final String MSG_PLOT_PREMISES_DETAILS_GET_SUCCESS = "Plots and Premises details fetched successfully";
	public static final String MSG_PLOT_PREMISES_DETAILS_GET_FAILURE = "Failed to fetch Plots and Premises details";
	
	public static final String MSG_VCT_SURVEY_INFO_SAVE_SUCCESS = "VCT Survey Information saved successfully";
	public static final String MSG_VCT_SURVEY_INFO_SAVE_FAILURE = "Failed to save VCT Survey Information";

	public static final String MSG_HOUSE_SURVEY_DETAILS_FETCH_SUCCESS = "House survey details fetched successfully";
	public static final String MSG_HOUSE_SURVEY_DETAILS_FETCH_FAILURE = "Failed to fetch House survey details";
	
	public static final String MSG_FLAT_DETAILS_FETCH_SUCCESS = "Flat details fetched successfully";
	public static final String MSG_FLAT_SURVEY_DETAILS_FETCH_FAILURE = "Failed to fetch Flat details";
	
	public static final String MSG_VCT_DETAILS_FETCH_SUCCESS = "VCT details fetched successfully";
	public static final String MSG_VCT_SURVEY_DETAILS_FETCH_FAILURE = "Failed to fetch VCT details";
	
	public static final String MSG_USER_TRACKING_DETAILS_SAVE_SUCCESS = "User Tracking details save successfully";
	public static final String MSG_USER_TRACKING_DETAILS_SAVE_FAILURE = "Failed to save user Tracking details";
	
	public static final String MSG_SURVEY_IMAGE_SAVE_SUCCESS = "Survey image save successfully";
	public static final String MSG_SURVEY_IMAGE_SAVE_FAILURE = "Failed to save survey image";
	
	public static final String MSG_TOWER_DETAILS_FETCH_SUCCESS = "Tower details fetched successfully";
	public static final String MSG_TOWER_SURVEY_DETAILS_FETCH_FAILURE = "Failed to fetch tower details";
	
	public static final String MSG_PLOT_DETAILS_FETCH_SUCCESS = "Plot details fetched successfully";
	public static final String MSG_PLOT_SURVEY_DETAILS_FETCH_FAILURE = "Failed to fetch plot details";
	
	public static final String MSG_IMAGE_FETCH_SUCCESS = "Image fetched successfully";
	public static final String MSG_IMAGE_FETCH_FAILURE = "Failed to fetch image";
	
	public static final String MSG_USER_INFO_FETCH_SUCCESS = "User info fetch successfully";
	public static final String MSG_USER_INFO_FETCH_FAILURE = "Failed to fetch user info";
	
	public static final String MSG_CITIZEN_REGISTER_SAVE_SUCCESS = "Citizen registration save successfully.";
	public static final String MSG_CITIZEN_REGISTER_SAVE_FAILURE = "Failed to save citizen registration!";
	public static final String MSG_CITIZEN_ALREADY_EXISTS = "Citizen Already registred!";
	public static final String MSG_CITIZEN_NOT_REGISTERED = "Citizen Not Registered yet!";
	
	public static final String MSG_CITIZEN_PROFILE_UPDATE_SUCCESS = "Citizen profile update successfully.";
	public static final String MSG_CITIZEN_PROFILE_UPDATE_FAILURE = "Failed to update citizen profile!";
	
	public static final String MSG_USER_LAST_LOCATION_SUCCESS = "User last location fetch successfully.";
	public static final String MSG_USER_LAST_LOCATION__FAILURE = "Failed to fetchUser last location!";
	
	public static final String MSG_PLOT_DETAILS_SAVE_SUCCESS = "Plot Info save successfully.";
	public static final String MSG_PLOT_DETAILS_SAVE_FAILURE = "Failed to save Plot Info!";
	public static final String MSG_INVALID_AREA_ID = "Invalid Action Area ID!";
	public static final String MSG_INVALID_BLOCK_ID = "Invalid Block ID!";
	
	public static final String MSG_ALL_PLOT_THAT_EXIST_FETCH_SUCCESS = "All Exist Plot Fetch Successfully!";
	public static final String MSG_ALL_PLOT_THAT_EXIST_FETCH_FAILURE = "Failed To Fetch All Exist Plot !";
	
	public static final String MSG_SUPERVISOR_DASHBOARD_DETAILS_FETCH_SUCCESS = "Supervisor Dashboard Details Fetch Successfully!";
	public static final String MSG_SUPERVISOR_DASHBOARD_DETAILS_FETCH_FAILURE = "Failed To Fetch Supervisor Dashboard Details!";
	
	public static final String MSG_SUPERVISOR_HH_PENDING_ACTION_FETCH_SUCCESS = "Supervisor HH Pending Action Fetch Successfully!";
	public static final String MSG_SUPERVISOR_HH_PENDING_ACTION_FETCH_FAILURE = "Failed To Fetch Supervisor HH Pending Action!";
	
	public static final String MSG_HH_SURVEY_INFO_FETCH_SUCCESS = "HH Survey Info Fetch Successfully!";
	public static final String MSG_HH_SURVEY_INFO_FETCH_FAILURE = "Failed To Fetch HH Survey Info!";
	
	public static final String MSG_VCT_SURVEY_INFO_FETCH_SUCCESS = "VCT Survey Info Fetch Successfully!";
	public static final String MSG_VCT_SURVEY_INFO_FETCH_FAILURE = "Failed To Fetch VCT Survey Info!";
	
	public static final String MSG_VCT_SURVEY_SUPERVISOR_ACTION_DETAILS_SAVE_FAILURE = "Failed to save VCT Survey Supervisor Action!";
	public static final String MSG_VCT_SURVEY_SUPERVISOR_ACTION_DETAILS_SUCCESS = "VCT Survey Supervisor Action save successfully.";
	public static final String MSG_INVALID_VCT_SURVEY_ID = "Invalid VCT Survey ID!";
	
	public static final String MSG_HOUSE_SURVEY_SUPERVISOR_ACTION_DETAILS_SAVE_FAILURE = "Failed to save House Survey Supervisor Action!";
	public static final String MSG_HOUSE_SURVEY_SUPERVISOR_ACTION_DETAILS_SUCCESS = "House Survey Supervisor Action save successfully.";
	
	public static final String MSG_NEW_USER_DETAILS_SAVE_FAILURE = "Failed to save New User Details";
	public static final String MSG_NEW_USER_DETAILS_SUCCESS =  "New User Details save successfully";
	public static final String MSG_DUPLICATE_DATA_FOUND_ERROR = "The User Already Exist";
	
	public static final String MSG_USER_ASSIGN_DETAILS_SAVE_FAILURE = "Failed to Assign User";
	public static final String MSG_USER_ASSIGN_DETAILS_SUCCESS =  "User Assigned successfully";
	
	public static final String MSG_ENTOMO_INFO_FETCH_FAILURE = "Entomo Info Fetch Successfully!";
	public static final String MSG_ENTOMO_INFO_FETCH_SUCCESS = "Failed To Fetch Entomo Info!";
	
	public static final String MSG_INVALID_FROM_DATE = "Invalid FromDate!";
	public static final String MSG_INVALID_TO_DATE = "Invalid ToDate!";
	
	public static final String MSG_NO_DATA_FOUND = "No Data Found!";
	public static final String MSG_USER_LIVE_TRACKING_INFO_FETCH_SUCCESS = "User Live Tracking Info Fetch Successfully!";
	
	public static final String MSG_PROPERTY_INFO_SAVE_SUCCESS = "Property Info save successfully.";
	public static final String MSG_PROPERTY_INFO_SAVE_FAILURE = "Failed to save Property Info!";
	public static final String MSG_INVALID_USER = "Invalid User!";
	
	public static final String MSG_CITIZEN_PROPERTY_INFO_FETCH_SUCCESS = "Citizen Property Info Fetch Successful";
	public static final String MSG_CITIZEN_PROPERTY_INFO_FETCH_FAILURE = "Failed to Fetch Citizen Property!";
	
	public static final String MSG_CITIZEN_PROFILE_INFO_FETCH_SUCCESS = "Citizen Profile Info Fetch Successful";
	public static final String MSG_CITIZEN_PROFILE_INFO_FETCH_FAILURE = "Failed to Fetch Citizen Profile!";
	

	public static final String MSG_CITIZEN_USER_INVALID = "Citizen User inavlid";
	public static final String MSG_CITIZEN_INVALID_PROPERTY = "Citizen Property invalid!";
	public static final String MSG_CITIZEN_PROPERTY_UPDATE_SUCCESS = "Citizen Property update Success";
	public static final String MSG_CITIZEN_PROPERTY_UPDATE_FAILURE = "Failed to Fetch Citizen Property";
	
	public static final String MSG_CITIZEN_TRACK_VCT_TEAM_INFO_FAILURE = "Failed to Fetch Citizin Track VCT team Info";
	public static final String MSG_CITIZEN_TRACK_VCT_TEAM_INFO_SUCCESS = "Citizen Track VCT team Info Fetched Successful";
	public static final String MSG_CITIZEN_TRACK_HH_Team_INFO_FAILURE = "Failed to Fetch Citizen Track HH team Info";
	public static final String MSG_CITIZEN_TRACK_HH_Team_INFO_SUCCESS = "Citizen Track HH team Info Fetched Successful";
	
	public static final String MSG_FEEDBACK_SAVE_SUCCESS = "Feedback save successfully.";
	public static final String MSG_FEEDBACK_SAVE_FAILURE = "Failed to save Feedback!";
	public static final String MSG_INVALID_PROPERTYID = "Invalid Property ID!";
	
	public static final String MSG_FLAGISSUE_SAVE_SUCCESS = "Flag Issue save successfully.";
	public static final String MSG_FLAGISSUE_SAVE_FAILURE = "Failed to save Flag Issue!";
	
	public static final String MSG_CITIZEN_TRACK_FLAGGED_ISSUES_INFO_FAILURE = "Failed to Fetch Citizen Track Flagged Issues";
	public static final String MSG_CITIZEN_TRACK_FLAGGED_ISSUES_INFO_SUCCESS = "Citizen Track Flagged Issues Fetched Successful";
	
	public static final String MSG_CITIZEN_SCHEDULE_INFO_FAILURE = "Failed to Fetch Citizen Schedule Info";
	public static final String MSG_CITIZEN_SCHEDULE_INFO_SUCCESS = "Citizen Schedule Info Fetched Successful";
	
	public static final String MSG_DENGUE_REPORT_SAVE_SUCCESS = "Dengue Report Save successfully.";
	public static final String MSG_DENGUE_REPORT_SAVE_FAILURE = "Failed to Save Dengue Report!";
	
	public static final String MSG_INVALID_CITIZEN_USER_ID = "Invalid Citizen User ID!";
	public static final String MSG_INSERT_ATLEAST_ONE_PHOTO = "Kindly Provide At Least One Photograph";
	
	public static final String SCHEDULE_INFO_SAVE_SUCCESS = "Schedule Info save successfully.";
	public static final String SCHEDULE_INFO_SAVE_FAILURE = "Failed to save Schedule Info!";
	
	public static final String MSG_SUPERVISOR_CTZ_PENDING_ACTION_FETCH_SUCCESS = "Supervisor CTZ Pending Action Fetch Successfully!";
	public static final String MSG_SUPERVISOR_CTZ_PENDING_ACTION_FETCH_FAILURE = "Failed To Fetch Supervisor CTZ Pending Action!";
	
	public static final String MSG_CTZ_FLAGGED_ISSUES_FETCH_SUCCESS = " CTZ Flagged Issues Fetch Successfully!";
	public static final String MSG_CTZ_FLAGGED_ISSUES_FETCH_FAILURE = "Failed To Fetch CTZ Flagged Issues!";
	
	public static final String CTZ_FLAG_ISSUE_SUPERVISOR_ACTION_SAVE_SUCCESS = "CTZ Flag Issue Supervisor Action save successfully.";
	public static final String CTZ_FLAG_ISSUE_SUPERVISOR_ACTION_SAVE_FAILURE = "Failed to save Flag Issue Supervisor Action!";
	
	public static final String MSG_CTZ_DENGUE_REPORT_FETCH_SUCCESS = " CTZ Dengue Report Details Fetch Successfully!";
	public static final String MSG_CTZ_DENGUE_REPORT_FETCH_FAILURE = "Failed To Fetch CTZ Dengue Report Details!";
	
	public static final String MSG_DENGUE_INFO_FETCH_SUCCESS ="Dengue Report Details Fetch Successfully!";
	
	public static final String MSG_SPRAY_SCHEDULE_DETAILS_GET_SUCCESS = "Spray Schedule Info  Fetch Successfully!";
	public static final String MSG_SPRAY_SCHEDULE_DETAILS_GET_FAILURE = "Failed To Fetch Spray Schedule Info!";
	public static final String MSG_REPORT_INFO_GET_SUCCESS = null;
	public static final String MSG_REPORT_INFO_GET_FAILURE = null;
	

}
