package com.utotech.danzhehplus.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.utotech.danzhehplus.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GamesFragmentDirections {
  private GamesFragmentDirections() {
  }

  @NonNull
  public static ActionGamesFragmentToVocabFragment actionGamesFragmentToVocabFragment(int unitNum) {
    return new ActionGamesFragmentToVocabFragment(unitNum);
  }

  @NonNull
  public static NavDirections actionGamesFragmentToCatchingWavesFragment() {
    return new ActionOnlyNavDirections(R.id.action_gamesFragment_to_catchingWavesFragment);
  }

  @NonNull
  public static NavDirections actionGamesFragmentToAstroidAttackFragment() {
    return new ActionOnlyNavDirections(R.id.action_gamesFragment_to_astroidAttackFragment);
  }

  @NonNull
  public static ActionGamesFragmentToStoryFragment actionGamesFragmentToStoryFragment(
      @NonNull String whichFragment) {
    return new ActionGamesFragmentToStoryFragment(whichFragment);
  }

  @NonNull
  public static NavDirections actionGamesFragmentToRecordFragment3() {
    return new ActionOnlyNavDirections(R.id.action_gamesFragment_to_recordFragment3);
  }

  public static class ActionGamesFragmentToVocabFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionGamesFragmentToVocabFragment(int unitNum) {
      this.arguments.put("unitNum", unitNum);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGamesFragmentToVocabFragment setUnitNum(int unitNum) {
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
      return R.id.action_gamesFragment_to_vocabFragment;
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
      ActionGamesFragmentToVocabFragment that = (ActionGamesFragmentToVocabFragment) object;
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
      return "ActionGamesFragmentToVocabFragment(actionId=" + getActionId() + "){"
          + "unitNum=" + getUnitNum()
          + "}";
    }
  }

  public static class ActionGamesFragmentToStoryFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionGamesFragmentToStoryFragment(@NonNull String whichFragment) {
      if (whichFragment == null) {
        throw new IllegalArgumentException("Argument \"whichFragment\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("whichFragment", whichFragment);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGamesFragmentToStoryFragment setWhichFragment(@NonNull String whichFragment) {
      if (whichFragment == null) {
        throw new IllegalArgumentException("Argument \"whichFragment\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("whichFragment", whichFragment);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("whichFragment")) {
        String whichFragment = (String) arguments.get("whichFragment");
        __result.putString("whichFragment", whichFragment);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_gamesFragment_to_storyFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getWhichFragment() {
      return (String) arguments.get("whichFragment");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGamesFragmentToStoryFragment that = (ActionGamesFragmentToStoryFragment) object;
      if (arguments.containsKey("whichFragment") != that.arguments.containsKey("whichFragment")) {
        return false;
      }
      if (getWhichFragment() != null ? !getWhichFragment().equals(that.getWhichFragment()) : that.getWhichFragment() != null) {
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
      result = 31 * result + (getWhichFragment() != null ? getWhichFragment().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGamesFragmentToStoryFragment(actionId=" + getActionId() + "){"
          + "whichFragment=" + getWhichFragment()
          + "}";
    }
  }
}
