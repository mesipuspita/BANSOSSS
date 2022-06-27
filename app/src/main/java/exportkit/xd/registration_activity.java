
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		project_3_android
	 *	@date 		1654522503131
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class registration_activity extends Activity {

	
	private View _bg__registration_ek2;
	private View ellipse_1_ek4;
	private View ellipse_2_ek4;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private TextView _9_45_ek1;
	private TextView welcome_onboard_;
	private TextView silahkan_daftar_akun;
	private View rectangle_1_ek7;
	private TextView register;
	private View rectangle_2_ek3;
	private TextView enter_your_email_ek1;
	private View rectangle_2_ek4;
	private TextView enter_your_full_name;
	private View rectangle_2_ek5;
	private TextView enter_password_ek1;
	private View rectangle_2_ek6;
	private TextView confirm_password;
	private TextView _already_have_an_account___sign_in;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.registration);

		
		_bg__registration_ek2 = (View) findViewById(R.id._bg__registration_ek2);
		ellipse_1_ek4 = (View) findViewById(R.id.ellipse_1_ek4);
		ellipse_2_ek4 = (View) findViewById(R.id.ellipse_2_ek4);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		_9_45_ek1 = (TextView) findViewById(R.id._9_45_ek1);
		welcome_onboard_ = (TextView) findViewById(R.id.welcome_onboard_);
		silahkan_daftar_akun = (TextView) findViewById(R.id.silahkan_daftar_akun);
		rectangle_1_ek7 = (View) findViewById(R.id.rectangle_1_ek7);
		register = (TextView) findViewById(R.id.register);
		rectangle_2_ek3 = (View) findViewById(R.id.rectangle_2_ek3);
		enter_your_email_ek1 = (TextView) findViewById(R.id.enter_your_email_ek1);
		rectangle_2_ek4 = (View) findViewById(R.id.rectangle_2_ek4);
		enter_your_full_name = (TextView) findViewById(R.id.enter_your_full_name);
		rectangle_2_ek5 = (View) findViewById(R.id.rectangle_2_ek5);
		enter_password_ek1 = (TextView) findViewById(R.id.enter_password_ek1);
		rectangle_2_ek6 = (View) findViewById(R.id.rectangle_2_ek6);
		confirm_password = (TextView) findViewById(R.id.confirm_password);
		_already_have_an_account___sign_in = (TextView) findViewById(R.id._already_have_an_account___sign_in);
	
		
		_already_have_an_account___sign_in.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	