package com.sovejo.lexdroidejercicio03;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.app.Activity;

public class MainActivity extends Activity implements OnClickListener
{
	ImageView imagen;
	Button boton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imagen = (ImageView) findViewById(R.id.monito);
		boton = (Button) findViewById(R.id.boton);
		
		boton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		switch (v.getId()) 
		{
		case R.id.boton:
			Animation rotacion = AnimationUtils.loadAnimation(this, R.anim.rotar);
			rotacion.reset();
			imagen.startAnimation(rotacion);
			break;

		default:
			break;
		}
	}

}
