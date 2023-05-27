package com.utotech.danzhehplus.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.utotech.danzhehplus.R;

public class CoursesFragmentDirections {
  private CoursesFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCoursesFragmentToContentFragment() {
    return new ActionOnlyNavDirections(R.id.action_coursesFragment_to_contentFragment);
  }
}
