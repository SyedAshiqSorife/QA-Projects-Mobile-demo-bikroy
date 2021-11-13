package utils;

import org.openqa.selenium.By;

public class Locators {
    //email and pass
    public static String emailText = "ashiq.qups@gmail.com";
    public static String passwordText = "Asdfgh123456";

    //bottom nav bar
    public static By postBtn = By.id("com.bikroy:id/btn_post");
    public static By homeBtn = By.id("com.bikroy:id/main_bottom_panel_home");
    public static By searchBtn = By.id("com.bikroy:id/main_bottom_panel_search");
    public static By chatBtn = By.id("com.bikroy:id/main_bottom_panel_chat");
    public static By profileBtn = By.id("com.bikroy:id/main_bottom_panel_my_account");

    //register activity
    public static By activityClose = By.id("com.bikroy:id/register_activity_close");
    public static By signUp_email_btn = By.id("com.bikroy:id/sign_in_sign_up_email_button");
    public static By emailField = By.id("com.bikroy:id/sign_in_email");
    public static By passwordField = By.id("com.bikroy:id/sign_in_password");
    public static By loginBtn = By.id("com.bikroy:id/register_register_button");
    public static By noAccountBtn = By.id("com.bikroy:id/register_have_account_text");
    public static By signUpBtn = By.id("com.bikroy:id/register_signup_button");
    public static By forgotPassBtn = By.id("com.bikroy:id/register_forgot_password");

    //profile screen
    public static By logoutBtn = By.id("com.bikroy:id/my_account_logout");

    //signup form
    //public static By nameField = By.name("নাম");
    // public static By emailField = By.name("ইমেইল");
    //public static By nameField = By.name("নাম");
    public static By confirmPassField = By.name("পাসওয়ার্ড আবার");
    public static String nameText = "Abir";
    public static String signupEmailText = "abir.qups@gmail.com";
    public static String signUpPasswordText = "Asdfgh123456";
    //public static String passwordText = "Asdfgh123456";

    //Account Page
    public static By myAds = By.id("com.bikroy:id/my_account_my_ads");
    public static By myMembership = By.id("com.bikroy:id/my_account_my_membership");
    public static By favorites = By.id("com.bikroy:id/my_account_favorites");
    public static By myProfile = By.id("com.bikroy:id/my_account_my_resume");
    public static By backButton = By.className("android.widget.ImageButton");

    //assert elements class names
    public static String headingElements = "android.widget.TextView";
    public static String adSliderItems = "android.widget.FrameLayout";

    //search item
    public static By editSearchField = By.id("com.bikroy:id/edit_search");
    public static By searchBox = By.id("com.bikroy:id/search_verticals");


}
