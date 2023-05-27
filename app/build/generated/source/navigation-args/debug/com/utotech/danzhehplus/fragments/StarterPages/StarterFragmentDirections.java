package com.utotech.danzhehplus.fragments.StarterPages;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.utotech.danzhehplus.R;

public class StarterFragmentDirections {
  private StarterFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionStarterFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_starterFragment_to_loginFragment);
  }

  @NonNull
  public static NavDirections actionStarterFragmentToSighnUpFragment() {
    return new ActionOnlyNavDirections(R.id.action_starterFragment_to_sighnUpFragment);
  }
}
