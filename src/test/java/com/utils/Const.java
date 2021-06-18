package com.utils;

import java.io.File;

public class Const {
	public static final int IMPLICIT_WAIT = 10;
	public static final String RESOURCE_PATH = "src" + File.separator + "test" + File.separator + "resources" + File.separator;
	public static final String CATEGORIES_FILE = "src/test/resources/categoryScope.json";
	public static final String ENCRYPTED = "Encrypted";
	public static final String PLAIN_TEXT = "PlainText";
	public static final String CHROME_COOKIES = "src/test/resources/chromeCookies.data";
	public static final String DOWNLOAD_DIR = System.getProperty("user.dir") + File.separator + "downloads/";
	public static final String IMAGES_DIR = RESOURCE_PATH + "Images/";
	public static final String ACTUAL_IMAGE = RESOURCE_PATH + "Images/actual.png";
	public static final String WIN_DOWNLOAD_DIR = System.getProperty("user.home") + File.separator + "Downloads/";

	public static final String SCREENSHOTS = "screenshots" + File.separator;

	public static final String CRYPT_EXT = "des";

	public static final String CHROME = "chrome";
	public static final String MS_EDGE = "MicrosoftEdge";
	public static final String MS_IE = "internet explorer";
}
