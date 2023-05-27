// Generated by view binder compiler. Do not edit!
package com.utotech.danzhehplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.utotech.danzhehplus.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentRowBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView card;

  @NonNull
  public final TextView txtTitle;

  private ContentRowBinding(@NonNull ConstraintLayout rootView, @NonNull CardView card,
      @NonNull TextView txtTitle) {
    this.rootView = rootView;
    this.card = card;
    this.txtTitle = txtTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card;
      CardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.txtTitle;
      TextView txtTitle = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle == null) {
        break missingId;
      }

      return new ContentRowBinding((ConstraintLayout) rootView, card, txtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
