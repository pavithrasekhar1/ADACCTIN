package org.test;

import org.openqa.selenium.WebDriver;

public class Sample1 extends Baseclass1  {
public static void main(String[] args) {
	WebDriver driver=getDriver();
	loadurl("https://www.facebook.com/");
	Login page=new Login();
	type(page.getTxtUserName(),"pavi");
	type(page.getPassWord(),"22345");
	btnclick(page.getLstBtnLogin().get(0));
	quitbrowser();
	
}
}
