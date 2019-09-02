package com.example.tabssample.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.tabssample.R;
import com.example.tabssample.adapters.IconTabsAdapter;
import com.example.tabssample.fragments.FragmentFive;
import com.example.tabssample.fragments.FragmentFour;
import com.example.tabssample.fragments.FragmentOne;
import com.example.tabssample.fragments.FragmentSix;
import com.example.tabssample.fragments.FragmentThree;
import com.example.tabssample.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity containing TABS with ICONS.
 * */
public class IconTabs extends AppCompatActivity {

	private List<Fragment> fragmentList = new ArrayList<>();

	private ViewPager viewPager;
	private IconTabsAdapter adapter;
	private TabLayout tabLayout;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_icon_tabs);

		initialise();

		prepareDataResource();

		adapter = new IconTabsAdapter(getSupportFragmentManager(), fragmentList);

		// Bind the Adapter to the ViewPager
		viewPager.setAdapter(adapter);

		// Link ViewPager and TabLayout
		tabLayout.setupWithViewPager(viewPager);

		setTabIcons(); // Set the icons to the Tabs
	}

	// Initialise Activity Data
	private void initialise() {
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbar.setTitle("Simple Icon Tabs");

		viewPager = (ViewPager) findViewById(R.id.viewPager);
		tabLayout = (TabLayout) findViewById(R.id.tabs);
	}

	// Prepare the Fragments List
	private void prepareDataResource() {

		fragmentList.add(new FragmentOne());
		fragmentList.add(new FragmentTwo());
		fragmentList.add(new FragmentThree());
		fragmentList.add(new FragmentFour());
		fragmentList.add(new FragmentFive());
		fragmentList.add(new FragmentSix());
	}

	// Set the Icons of the Tabs
	private void setTabIcons() {

		tabLayout.getTabAt(0).setIcon(R.drawable.facebook);
		tabLayout.getTabAt(1).setIcon(R.drawable.linkedin);
		tabLayout.getTabAt(2).setIcon(R.drawable.whatsapp);
		tabLayout.getTabAt(3).setIcon(R.drawable.youtube);
		tabLayout.getTabAt(4).setIcon(R.drawable.twitter);
		tabLayout.getTabAt(5).setIcon(R.drawable.googleplus);
	}
}

