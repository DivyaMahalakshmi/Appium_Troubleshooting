package com.wipro.ebay.constants;

public class WebElementConstants {


	public static final String SIGN_IN_BUTTON = "//android.widget.LinearLayout[@content-desc=\"Sign in or Register\"]/android.widget.LinearLayout/android.widget.Button[2]";
	public static final String USERNAME_FIELD = "//*[@id=\"userid\"]";
	public static final String PASSWORD_FIELD = "//*[@id=\"userid\"]";
	public static final String SINGIN_SUBMIT = "//*[@id=\"sgnBt\"]";
	public static final String SEARCH= "com.ebay.mobile:id/search_src_text";
	public static final String SEARCH_RESULT = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView"
	+ "/android.widget.RelativeLayout[1]/android.widget.TextView";
	public static final String RESULT_ITEM = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout"
			+ "/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup"
			+ "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout"
			+ "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout"
			+ "/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]"
			+ "/android.widget.LinearLayout/android.widget.TextView[2]\r\n";
	public static final String ADD_TO_CART ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\r\n";
			
	public static final String QUANTITY =	"//android.widget.Spinner[@content-desc=\"QTY,3\"]";
	public static final String BASKET_ICON = "//android.widget.FrameLayout[@content-desc=\"Basket, 1 item, button.\"]/android.widget.TextView\r\n";
    public static final String CHECKOUT = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]";
	public static final String PAYMENT = "	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView";
	// Setting a private constructor
    public static final String CREDIT_OPTION = "//android.view.ViewGroup[@content-desc=\"Credit or debit card\"]/android.widget.RelativeLayout[2]/android.widget.ImageView";
	public static final String CARDNUMBER = "Card Number";
	public static final String EXPIRY = "Expiry Date";
	public static final String SECURITY_CODE = "Security code";
	public static final String CARD_NUMBER = "Card Number";
	public static final String DONE_BUTTON = "Done";
	private WebElementConstants()


{
	

}
}
