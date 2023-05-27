package com.utotech.danzhehplus.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.utotech.danzhehplus.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ContentFragmentDirections {
  private ContentFragmentDirections() {
  }

  @NonNull
  public static ActionContentFragmentToVocabFragment actionContentFragmentToVocabFragment(
      int unitNum) {
    return new ActionContentFragmentToVocabFragment(unitNum);
  }

  @NonNull
  public static ActionContentFragmentToGamesFragment actionContentFragmentToGamesFragment(
      int unitNum) {
    return new ActionContentFragmentToGamesFragment(unitNum);
  }

  public static class ActionContentFragmentToVocabFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionContentFragmentToVocabFragment(int unitNum) {
      this.arguments.put("unitNum", unitNum);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionContentFragmentToVocabFragment setUnitNum(int unitNum) {
      this.arguments.put("unitNum", unitNum);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("unitNum")) {
        int unitNum = (int) arguments.get("unitNum");
        __result.putInt("unitNum", unitNum);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_contentFragment_to_vocabFragment;
    }

    @SuppressWarnings("unchecked")
    public int getUnitNum() {
      return (int) arguments.get("unitNum");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionContentFragmentToVocabFragment that = (ActionContentFragmentToVocabFragment) object;
      if (arguments.containsKey("unitNum") != that.arguments.containsKey("unitNum")) {
        return false;
      }
      if (getUnitNum() != that.getUnitNum()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getUnitNum();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionContentFragmentToVocabFragment(actionId=" + getActionId() + "){"
          + "unitNum=" + getUnitNum()
          + "}";
    }
  }

  public static class ActionContentFragmentToGamesFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionContentFragmentToGamesFragment(int unitNum) {
      this.arguments.put("unitNum", unitNum);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionContentFragmentToGamesFragment setUnitNum(int unitNum) {
      this.arguments.put("unitNum", unitNum);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("unitNum")) {
        int unitNum = (int) arguments.get("unitNum");
        __result.putInt("unitNum", unitNum);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_contentFragment_to_gamesFragment;
    }

    @SuppressWarnings("unchecked")
    public int getUnitNum() {
      return (int) arguments.get("unitNum");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionContentFragmentToGamesFragment that = (ActionContentFragmentToGamesFragment) object;
      if (arguments.containsKey("unitNum") != that.arguments.containsKey("unitNum")) {
        return false;
      }
      if (getUnitNum() != that.getUnitNum()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getUnitNum();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionContentFragmentToGamesFragment(actionId=" + getActionId() + "){"
          + "unitNum=" + getUnitNum()
          + "}";
    }
  }
}
