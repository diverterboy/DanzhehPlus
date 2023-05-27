// Generated by view binder compiler. Do not edit!
package com.utotech.danzhehplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.utotech.danzhehplus.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentVocabBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnDone;

  @NonNull
  public final Button btnRepeat;

  @NonNull
  public final LinearLayout linear;

  @NonNull
  public final LinearLayout linearBase;

  @NonNull
  public final ViewPager2 pagerVocab;

  @NonNull
  public final RecyclerView recyclerPics;

  @NonNull
  public final RecyclerView recyclerPinView;

  @NonNull
  public final LinearLayout root;

  @NonNull
  public final TextView txtVocab;

  private FragmentVocabBinding(@NonNull LinearLayout rootView, @NonNull Button btnDone,
      @NonNull Button btnRepeat, @NonNull LinearLayout linear, @NonNull LinearLayout linearBase,
      @NonNull ViewPager2 pagerVocab, @NonNull RecyclerView recyclerPics,
      @NonNull RecyclerView recyclerPinView, @NonNull LinearLayout root,
      @NonNull TextView txtVocab) {
    this.rootView = rootView;
    this.btnDone = btnDone;
    this.btnRepeat = btnRepeat;
    this.linear = linear;
    this.linearBase = linearBase;
    this.pagerVocab = pagerVocab;
    this.recyclerPics = recyclerPics;
    this.recyclerPinView = recyclerPinView;
    this.root = root;
    this.txtVocab = txtVocab;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentVocabBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentVocabBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_vocab, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentVocabBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDone;
      Button btnDone = ViewBindings.findChildViewById(rootView, id);
      if (btnDone == null) {
        break missingId;
      }

      id = R.id.btnRepeat;
      Button btnRepeat = ViewBindings.findChildViewById(rootView, id);
      if (btnRepeat == null) {
        break missingId;
      }

      id = R.id.linear;
      LinearLayout linear = ViewBindings.findChildViewById(rootView, id);
      if (linear == null) {
        break missingId;
      }

      id = R.id.linearBase;
      LinearLayout linearBase = ViewBindings.findChildViewById(rootView, id);
      if (linearBase == null) {
        break missingId;
      }

      id = R.id.pagerVocab;
      ViewPager2 pagerVocab = ViewBindings.findChildViewById(rootView, id);
      if (pagerVocab == null) {
        break missingId;
      }

      id = R.id.recyclerPics;
      RecyclerView recyclerPics = ViewBindings.findChildViewById(rootView, id);
      if (recyclerPics == null) {
        break missingId;
      }

      id = R.id.recyclerPinView;
      RecyclerView recyclerPinView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerPinView == null) {
        break missingId;
      }

      LinearLayout root = (LinearLayout) rootView;

      id = R.id.txtVocab;
      TextView txtVocab = ViewBindings.findChildViewById(rootView, id);
      if (txtVocab == null) {
        break missingId;
      }

      return new FragmentVocabBinding((LinearLayout) rootView, btnDone, btnRepeat, linear,
          linearBase, pagerVocab, recyclerPics, recyclerPinView, root, txtVocab);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
