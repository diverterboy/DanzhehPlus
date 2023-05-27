package com.utotech.danzhehplus.fragments.StarterPages;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.utotech.danzhehplus.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToForgotPassFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_forgotPassFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToSighnUpFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_sighnUpFragment);
  }
}
