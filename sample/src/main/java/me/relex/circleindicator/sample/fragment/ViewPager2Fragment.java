package me.relex.circleindicator.sample.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import me.relex.circleindicator.CircleIndicatorPager2;
import me.relex.circleindicator.sample.R;
import me.relex.circleindicator.sample.SampleRecyclerAdapter;

public class ViewPager2Fragment extends Fragment{

    public ViewPager2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final ViewPager2 viewPager2 = view.findViewById(R.id.recycler_view);
        viewPager2.setAdapter(new SampleRecyclerAdapter(5));
        view.findViewById(R.id.change_orientation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager2.setOrientation(viewPager2.getOrientation() == ViewPager2.ORIENTATION_VERTICAL ? ViewPager2.ORIENTATION_HORIZONTAL : ViewPager2.ORIENTATION_VERTICAL);
            }
        });

        // CircleIndicator2 for ViewPager2
        CircleIndicatorPager2 indicator = view.findViewById(R.id.indicator);
        indicator.setViewPager(viewPager2);
    }
}
