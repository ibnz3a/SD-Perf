package xzr.konabess;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        MaterialToolbar toolbar = findViewById(R.id.about_toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());

        TextView versionText = findViewById(R.id.about_version);
        try {
            String versionName = getPackageManager()
                    .getPackageInfo(getPackageName(), 0).versionName;
            versionText.setText(getString(R.string.about_version_fmt, versionName));
        } catch (PackageManager.NameNotFoundException ignored) {
        }

        TextView authorText = findViewById(R.id.about_author);
        authorText.setText(getString(R.string.author) + " r0xx3z");

        TextView basedOnText = findViewById(R.id.about_based_on);
        basedOnText.setText(R.string.about_based_on);

        findViewById(R.id.about_github).setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getString(R.string.about_github_url)))));
    }
}