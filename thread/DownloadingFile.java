
import java.io.*;
import java.net.*;
import java.util.*;

public class DownloadingFile{

	public static void main(String args[]){


		String [] urls = fetchUrls();

		for(String url : urls){
			DownloadThread downloadThread = new DownloadThread(url);
			downloadThread.start();
		}
		
	}


	private static String [] fetchUrls(){
		String folder = "https://ftp.newgen.co.in/~productccm/OmniOMSReleases/11.0SP1/";
		String initialFileName = "OmniOMS_11.0_SP1_00_00";
		String fileExtension = ".zip";

		String [] urls = new String[10];
		for(int i=0; i<10; i++){
			String completeUrl = folder + initialFileName + i + fileExtension;
			urls[i] = completeUrl;
		}

		return urls;
	}



}


class DownloadThread extends Thread{

	private String url;
	private String username;
	private String password;

	public DownloadThread(String url){
		this.url = url;
		username = "newgen";
		password = "yD&PUCr3Y@ZG";
	}

	@Override
	public void run(){

		try{
			downloadFile(url);
		}catch(Exception ex){

		}
		
	}


	private void downloadFile(String url) throws MalformedURLException, IOException{

		// Create URL object
        URL ur = new URL(url);

        // Open a connection to the URL
        HttpURLConnection connection = (HttpURLConnection) ur.openConnection();

        // Set basic authentication
        String auth = username + ":" + password;
        String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
        String authHeader = "Basic " + encodedAuth;
        connection.setRequestProperty("Authorization", authHeader);


        // Open input stream from the URL
        try (InputStream in = connection.getInputStream();
             FileOutputStream out = new FileOutputStream(new File("downloaded_" + url.substring(url.lastIndexOf('/') + 1)))) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            System.out.println("Downloaded: " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}