package com.utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encrypte {
	
	
	public static void main(String[] args) throws Exception {
//		String password = "12qwaszx";
//		String userId = "system";
//		String pwd = encrypt(password,userId);
//		System.out.println(pwd);
//		System.out.println(sha1(pwd));
//		System.out.println(sha1(password));

//		String password = "12qwaszx";
//		String userId = "1";
//
//		String pwd = getEncrypt(userId, password);
//		System.out.println(pwd);
//		
//		password = "12qwaszx";
//		userId = "system";
//
//		pwd = getEncrypt(userId, password);
//		System.out.println(pwd);
		 
		String dec = getEncrypt("fachrizal", "12qwaszx");
		System.out.println(dec);
		//aebc3ebee2f0c8b08b43d26c2b0055b19caeaf4a
		//aebc3ebee2f0c8b08b43d26c2b0055b19caeaf4a
	}
	
	public static String getEncrypt(String userId, String password) throws Exception {
		String pwd = encrypt(userId, password); 
		pwd = sha1(pwd);
		return pwd;
	}
    /**
     * @param args
     * @throws NoSuchAlgorithmException 
     */
	public static String sha1(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
         
        return sb.toString();
    }
	
	public static String encrypt(String strKey, String strClearText ) throws Exception {
		String strData="";
		
		try {
			SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
			Cipher cipher=Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
			byte[] encrypted=cipher.doFinal(strClearText.getBytes());
			strData=new String(encrypted);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return strData;
	}
	
	public static String decrypt(String strKey, String strEncrypted) throws Exception {
		String strData="";
		
		try {
			SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
			Cipher cipher=Cipher.getInstance("Blowfish");
			cipher.init(Cipher.DECRYPT_MODE, skeyspec);
			byte[] decrypted=cipher.doFinal(strEncrypted.getBytes());
			strData=new String(decrypted);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return strData;
	}	
    /**
     * Verifies file's SHA1 checksum
     * @param Filepath and name of a file that is to be verified
     * @param testChecksum the expected checksum
     * @return true if the expeceted SHA1 checksum matches the file's SHA1 checksum; false otherwise.
     * @throws NoSuchAlgorithmException
     * @throws IOException
     */
    public static boolean verifyChecksum(String file, String testChecksum) throws NoSuchAlgorithmException, IOException
    {
        MessageDigest sha1 = MessageDigest.getInstance("SHA1");
        FileInputStream fis = new FileInputStream(file);
  
        byte[] data = new byte[1024];
        int read = 0; 
        while ((read = fis.read(data)) != -1) {
            sha1.update(data, 0, read);
        };
        byte[] hashBytes = sha1.digest();
  
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < hashBytes.length; i++) {
          sb.append(Integer.toString((hashBytes[i] & 0xff) + 0x100, 16).substring(1));
        }
         
        String fileHash = sb.toString();
         
        return fileHash.equals(testChecksum);
    }
}

