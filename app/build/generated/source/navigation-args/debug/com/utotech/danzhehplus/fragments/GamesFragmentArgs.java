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

public class GamesFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private GamesFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private GamesFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GamesFragmentArgs fromBundle(@NonNull Bundle bundle) {
    GamesFragmentArgs __result = new GamesFragmentArgs();
    bundle.setClassLoader(GamesFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("unitNum")) {
      int unitNum;
      unitNum = bundle.getInt("unitNum");
      __result.arguments.put("unitNum", unitNum);
    } else {
      throw new IllegalArgumentException("Required argument \"unitNum\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GamesFragmentArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    GamesFragmentArgs __result = new GamesFragmentArgs();
    if (savedStateHandle.contains("unitNum")) {
      int unitNum;
      unitNum = savedStateHandle.get("unitNum");
      __result.arguments.put("unitNum", unitNum);
    } else {
      throw new IllegalArgumentException("Required argument \"unitNum\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getUnitNum() {
    return (int) arguments.get("unitNum");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("unitNum")) {
      int unitNum = (int) arguments.get("unitNum");
      __result.putInt("unitNum", unitNum);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("unitNum")) {
      int unitNum = (int) arguments.get("unitNum");
      __result.set("unitNum", unitNum);
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
    GamesFragmentArgs that = (GamesFragmentArgs) object;
    if (arguments.containsKey("unitNum") != that.arguments.containsKey("unitNum")) {
      return false;
    }
    if (getUnitNum() != that.getUnitNum()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getUnitNum();
    return result;
  }

  @Override
  public String toString() {
    return "GamesFragmentArgs{"
        + "unitNum=" + getUnitNum()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull GamesFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int unitNum) {
      this.arguments.put("unitNum", unitNum);
    }

    @NonNull
    public GamesFragmentArgs build() {
      GamesFragmentArgs result = new GamesFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setUnitNum(int unitNum) {
      this.arguments.put("unitNum", unitNum);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getUnitNum() {
      return (int) arguments.get("unitNum");
    }
  }
}
