package com.example.tabssample.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import com.example.tabssample.R;
import com.example.tabssample.adapters.ScrollTabsAdapter;
import com.example.tabssample.fragments.FragmentFive;
import com.example.tabssample.fragments.FragmentFour;
import com.example.tabssample.fragments.FragmentOne;
import com.example.tabssample.fragments.FragmentSix;
import com.example.tabssample.fragments.FragmentThree;
import com.example.tabssample.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity having SCROLLABLE TABS with TEXT
 */
public class ScrollTabs extends AppCompatActivity {

	private List<Fragment> fragmentList = new ArrayList<>();
	private List<String> titleList = new ArrayList<>();

	private ViewPager viewPager;
	private ScrollTabsAdapter adapter;
	private TabLayout tabLayout;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scroll_tabs);

		initialise();

		prepareDataResource();

		adapter = new ScrollTabsAdapter(getSupportFragmentManager(), fragmentList, titleList);

		// Bind Adapter to ViewPager.
		viewPager.setAdapter(adapter);

		// Link ViewPager and TabLayout
		tabLayout.setupWithViewPager(viewPager);
	}

	// Initialise Activity Data.
	private void initialise() {
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbar.setTitle("Scroll Tabs Example");

		viewPager = (ViewPager) findViewById(R.id.viewPager);
		tabLayout = (TabLayout) findViewById(R.id.tabs);
	}

	// Let's prepare Data for our Tabs - Fragments and Title List
	private void prepareDataResource() {

		addData(new FragmentOne(), "ONE");
		addData(new FragmentTwo(), "TWO");
		addData(new FragmentThree(), "THREE");
		addData(new FragmentFour(), "FOUR");
		addData(new FragmentFive(), "FIVE");
		addData(new FragmentSix(), "SIX");

		addData(new FragmentOne(), "ONE");
		addData(new FragmentTwo(), "TWO");
		addData(new FragmentThree(), "THREE");
		addData(new FragmentFour(), "FOUR");
		addData(new FragmentFive(), "FIVE");
		addData(new FragmentSix(), "SIX");
	}

	private void addData(Fragment fragment, String title) {
		fragmentList.add(fragment);
		titleList.add(title);
	}
}
