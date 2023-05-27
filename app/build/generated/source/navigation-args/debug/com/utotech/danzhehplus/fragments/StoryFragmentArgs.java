package com.utotech.danzhehplus.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class StoryFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private StoryFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private StoryFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static StoryFragmentArgs fromBundle(@NonNull Bundle bundle) {
    StoryFragmentArgs __result = new StoryFragmentArgs();
    bundle.setClassLoader(StoryFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("whichFragment")) {
      String whichFragment;
      whichFragment = bundle.getString("whichFragment");
      if (whichFragment == null) {
        throw new IllegalArgumentException("Argument \"whichFragment\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("whichFragment", whichFragment);
    } else {
      throw new IllegalArgumentException("Required argument \"whichFragment\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static StoryFragmentArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    StoryFragmentArgs __result = new StoryFragmentArgs();
    if (savedStateHandle.contains("whichFragment")) {
      String whichFragment;
      whichFragment = savedStateHandle.get("whichFragment");
      if (whichFragment == null) {
        throw new IllegalArgumentException("Argument \"whichFragment\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("whichFragment", whichFragment);
    } else {
      throw new IllegalArgumentException("Required argument \"whichFragment\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getWhichFragment() {
    return (String) arguments.get("whichFragment");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("whichFragment")) {
      String whichFragment = (String) arguments.get("whichFragment");
      __result.putString("whichFragment", whichFragment);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("whichFragment")) {
      String whichFragment = (String) arguments.get("whichFragment");
      __result.set("whichFragment", whichFragment);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    StoryFragmentArgs that = (StoryFragmentArgs) object;
    if (arguments.containsKey("whichFragment") != that.arguments.containsKey("whichFragment")) {
      return false;
    }
    if (getWhichFragment() != null ? !getWhichFragment().equals(that.getWhichFragment()) : that.getWhichFragment() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getWhichFragment() != null ? getWhichFragment().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "StoryFragmentArgs{"
        + "whichFragment=" + getWhichFragment()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull StoryFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String whichFragment) {
      if (whichFragment == null) {
        throw new IllegalArgumentException("Argument \"whichFragment\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("whichFragment", whichFragment);
    }

    @NonNull
    public StoryFragmentArgs build() {
      StoryFragmentArgs result = new StoryFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setWhichFragment(@NonNull String whichFragment) {
      if (whichFragment == null) {
        throw new IllegalArgumentException("Argument \"whichFragment\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("whichFragment", whichFragment);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getWhichFragment() {
      return (String) arguments.get("whichFragment");
    }
  }
}
