package jp.ac.st.asojuku.original2014002;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;



public class MaintenanceActivity extends Activity implements
View.OnClickListener, AdapterView.OnItemClickListener{

	SQLiteDatabase sdb = null;
	MySQLiteOpenHelper helper = null;
	int selectedID = -1;
	int lastPosotion = -1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maintenanceactivity);
	}


}
