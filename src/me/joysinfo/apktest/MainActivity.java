package me.joysinfo.apktest;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {
   private Button bt;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
         bt= (Button) this.findViewById(R.id.open);
         bt.setOnClickListener(this);
	 }

    @Override
    public void onClick(View view) {
        Log.d("CUI","Onclick");
        switch (view.getId()){
            case R.id.open:
                //查找所有包名
             PackageManager pm=getPackageManager();
             List<PackageInfo> infos= pm.getInstalledPackages(PackageManager.GET_UNINSTALLED_PACKAGES);
              for(PackageInfo info:infos){
                  Log.d("CUI","packageName:"+info.packageName);
              }
                break;
        }
    }
}
