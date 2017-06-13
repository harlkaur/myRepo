package com.shc.string;

public class Checksum {

	public static void main(String[] args) {

		
	}
	
	/*private String getCheckSum(byte[] image) throws NoSuchAlgorithmException {
		String url = "http://img.championat.com/news/big/l/c/ujejn-runi_1439911080563855663.jpg";
		byte[] imageBytes = restTemplate.getForObject(url, byte[].class);
		MessageDigest md = MessageDigest.getInstance("SHA1");
		int nread = 0;
		md.update(imageBytes);
		byte[] mdbytes = md.digest();
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < mdbytes.length; i++) {
			sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		System.out.println(sb.toString());
		return imageServiceUri;
	}*/
	
	/*public String calculateCheckSum(String imageURI) {
		byte[] imageBytes = restTemplate.getForObject(imageURI, byte[].class);
		MessageDigest md;
		StringBuffer sb = new StringBuffer("");
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(imageBytes);
			byte[] mdbytes = md.digest();

			for (int i = 0; i < mdbytes.length; i++) {
				sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}*/

}
