// Generated by view binder compiler. Do not edit!
package com.utotech.danzhehplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.utotech.danzhehplus.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PagerCoursesRowBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView imgAuthor;

  @NonNull
  public final ImageView imgLevel;

  @NonNull
  public final ImageView imgNumLevel;

  @NonNull
  public final ImageView imgPlay;

  @NonNull
  public final ImageView imgTest;

  @NonNull
  public final ImageView imgWonder;

  @NonNull
  public final TextView numLevels;

  @NonNull
  public final TextView txtAuthor;

  @NonNull
  public final TextView txtAuthorContent;

  @NonNull
  public final TextView txtCourseName;

  @NonNull
  public final TextView txtDescription;

  @NonNull
  public final TextView txtLevel;

  @NonNull
  public final TextView txtLevelContent;

  @NonNull
  public final ViewPager2 vp2;

  private PagerCoursesRowBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull ImageView imgAuthor, @NonNull ImageView imgLevel, @NonNull ImageView imgNumLevel,
      @NonNull ImageView imgPlay, @NonNull ImageView imgTest, @NonNull ImageView imgWonder,
      @NonNull TextView numLevels, @NonNull TextView txtAuthor, @NonNull TextView txtAuthorContent,
      @NonNull TextView txtCourseName, @NonNull TextView txtDescription, @NonNull TextView txtLevel,
      @NonNull TextView txtLevelContent, @NonNull ViewPager2 vp2) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.imgAuthor = imgAuthor;
    this.imgLevel = imgLevel;
    this.imgNumLevel = imgNumLevel;
    this.imgPlay = imgPlay;
    this.imgTest = imgTest;
    this.imgWonder = imgWonder;
    this.numLevels = numLevels;
    this.txtAuthor = txtAuthor;
    this.txtAuthorContent = txtAuthorContent;
    this.txtCourseName = txtCourseName;
    this.txtDescription = txtDescription;
    this.txtLevel = txtLevel;
    this.txtLevelContent = txtLevelContent;
    this.vp2 = vp2;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PagerCoursesRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PagerCoursesRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.pager_courses_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PagerCoursesRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.imgAuthor;
      ImageView imgAuthor = ViewBindings.findChildViewById(rootView, id);
      if (imgAuthor == null) {
        break missingId;
      }

      id = R.id.imgLevel;
      ImageView imgLevel = ViewBindings.findChildViewById(rootView, id);
      if (imgLevel == null) {
        break missingId;
      }

      id = R.id.imgNumLevel;
      ImageView imgNumLevel = ViewBindings.findChildViewById(rootView, id);
      if (imgNumLevel == null) {
        break missingId;
      }

      id = R.id.imgPlay;
      ImageView imgPlay = ViewBindings.findChildViewById(rootView, id);
      if (imgPlay == null) {
        break missingId;
      }

      id = R.id.imgTest;
      ImageView imgTest = ViewBindings.findChildViewById(rootView, id);
      if (imgTest == null) {
        break missingId;
      }

      id = R.id.imgWonder;
      ImageView imgWonder = ViewBindings.findChildViewById(rootView, id);
      if (imgWonder == null) {
        break missingId;
      }

      id = R.id.numLevels;
      TextView numLevels = ViewBindings.findChildViewById(rootView, id);
      if (numLevels == null) {
        break missingId;
      }

      id = R.id.txtAuthor;
      TextView txtAuthor = ViewBindings.findChildViewById(rootView, id);
      if (txtAuthor == null) {
        break missingId;
      }

      id = R.id.txtAuthorContent;
      TextView txtAuthorContent = ViewBindings.findChildViewById(rootView, id);
      if (txtAuthorContent == null) {
        break missingId;
      }

      id = R.id.txtCourseName;
      TextView txtCourseName = ViewBindings.findChildViewById(rootView, id);
      if (txtCourseName == null) {
        break missingId;
      }

      id = R.id.txtDescription;
      TextView txtDescription = ViewBindings.findChildViewById(rootView, id);
      if (txtDescription == null) {
        break missingId;
      }

      id = R.id.txtLevel;
      TextView txtLevel = ViewBindings.findChildViewById(rootView, id);
      if (txtLevel == null) {
        break missingId;
      }

      id = R.id.txtLevelContent;
      TextView txtLevelContent = ViewBindings.findChildViewById(rootView, id);
      if (txtLevelContent == null) {
        break missingId;
      }

      id = R.id.vp2;
      ViewPager2 vp2 = ViewBindings.findChildViewById(rootView, id);
      if (vp2 == null) {
        break missingId;
      }

      return new PagerCoursesRowBinding((CardView) rootView, cardView, imgAuthor, imgLevel,
          imgNumLevel, imgPlay, imgTest, imgWonder, numLevels, txtAuthor, txtAuthorContent,
          txtCourseName, txtDescription, txtLevel, txtLevelContent, vp2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
