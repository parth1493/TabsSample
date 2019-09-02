package com.example.tabssample.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sriyanksiddhartha.materialtabs.R;
import com.sriyanksiddhartha.materialtabs.adapters.TextTabsAdapter;
import com.sriyanksiddhartha.materialtabs.fragments.FragmentOne;
import com.sriyanksiddhartha.materialtabs.fragments.FragmentThree;
import com.sriyanksiddhartha.materialtabs.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity having TABS with TEXT
 *
 * Also, this Activity contains codes for TABS with both TEXT + ICONS.
 */
public class TextTabs extends AppCompatActivity {

	private List<Fragment> fragmentList = new ArrayList<>();
	private List<String> titleList = new ArrayList<>();

	private ViewPager viewPager;
	private TextTabsAdapter adapter;
	private TabLayout tabLayout;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_tabs);

		initialise();

		prepareDataResource();

		adapter = new TextTabsAdapter(getSupportFragmentManager(), fragmentList, titleList);

		// Bind Adapter to ViewPager.
		viewPager.setAdapter(adapter);

		// Link ViewPager and TabLayout
		tabLayout.setupWithViewPager(viewPager);

		// Uncomment the LINE BELOW to see TABS with both TEXT+ICONS
		//setTabIcons();
	}

	// Initialise Activity Data.
	private void initialise() {
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbar.setTitle("Simple Tabs Example");

		viewPager = (ViewPager) findViewById(R.id.viewPager);
		tabLayout = (TabLayout) findViewById(R.id.tabs);
	}

	// Let's prepare Data for our Tabs - Fragments and Title List
	private void prepareDataResource() {

		addData(new FragmentOne(), "ONE");
		addData(new FragmentTwo(), "TWO");
		addData(new FragmentThree(), "THREE");
	}

	private void addData(Fragment fragment, String title) {
		fragmentList.add(fragment);
		titleList.add(title);
	}

	// Sets the Icons for the Tabs
	private void setTabIcons() {

		tabLayout.getTabAt(0).setIcon(R.drawable.facebook);
		tabLayout.getTabAt(1).setIcon(R.drawable.linkedin);
		tabLayout.getTabAt(2).setIcon(R.drawable.googleplus);
	}
}
