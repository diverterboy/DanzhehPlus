// Generated by view binder compiler. Do not edit!
package com.utotech.danzhehplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.utotech.danzhehplus.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSighnUpBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextInputEditText edtEmailSignup;

  @NonNull
  public final TextInputEditText edtNation;

  @NonNull
  public final TextInputEditText edtPass;

  @NonNull
  public final TextInputEditText edtPassConfirm;

  @NonNull
  public final TextInputEditText edtPhone;

  @NonNull
  public final TextInputEditText edtSureName;

  @NonNull
  public final TextInputEditText edtUser;

  @NonNull
  public final TextInputEditText estFirstName;

  @NonNull
  public final TextView txtErrEmail;

  @NonNull
  public final TextView txtErrFirstName;

  @NonNull
  public final TextView txtErrLastName;

  @NonNull
  public final TextView txtErrNation;

  @NonNull
  public final TextView txtErrPass;

  @NonNull
  public final TextView txtErrPassConfirm;

  @NonNull
  public final TextView txtErrPhone;

  @NonNull
  public final TextView txtErrUser;

  private FragmentSighnUpBinding(@NonNull LinearLayout rootView,
      @NonNull TextInputEditText edtEmailSignup, @NonNull TextInputEditText edtNation,
      @NonNull TextInputEditText edtPass, @NonNull TextInputEditText edtPassConfirm,
      @NonNull TextInputEditText edtPhone, @NonNull TextInputEditText edtSureName,
      @NonNull TextInputEditText edtUser, @NonNull TextInputEditText estFirstName,
      @NonNull TextView txtErrEmail, @NonNull TextView txtErrFirstName,
      @NonNull TextView txtErrLastName, @NonNull TextView txtErrNation,
      @NonNull TextView txtErrPass, @NonNull TextView txtErrPassConfirm,
      @NonNull TextView txtErrPhone, @NonNull TextView txtErrUser) {
    this.rootView = rootView;
    this.edtEmailSignup = edtEmailSignup;
    this.edtNation = edtNation;
    this.edtPass = edtPass;
    this.edtPassConfirm = edtPassConfirm;
    this.edtPhone = edtPhone;
    this.edtSureName = edtSureName;
    this.edtUser = edtUser;
    this.estFirstName = estFirstName;
    this.txtErrEmail = txtErrEmail;
    this.txtErrFirstName = txtErrFirstName;
    this.txtErrLastName = txtErrLastName;
    this.txtErrNation = txtErrNation;
    this.txtErrPass = txtErrPass;
    this.txtErrPassConfirm = txtErrPassConfirm;
    this.txtErrPhone = txtErrPhone;
    this.txtErrUser = txtErrUser;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSighnUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSighnUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sighn_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSighnUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtEmailSignup;
      TextInputEditText edtEmailSignup = ViewBindings.findChildViewById(rootView, id);
      if (edtEmailSignup == null) {
        break missingId;
      }

      id = R.id.edtNation;
      TextInputEditText edtNation = ViewBindings.findChildViewById(rootView, id);
      if (edtNation == null) {
        break missingId;
      }

      id = R.id.edtPass;
      TextInputEditText edtPass = ViewBindings.findChildViewById(rootView, id);
      if (edtPass == null) {
        break missingId;
      }

      id = R.id.edtPassConfirm;
      TextInputEditText edtPassConfirm = ViewBindings.findChildViewById(rootView, id);
      if (edtPassConfirm == null) {
        break missingId;
      }

      id = R.id.edtPhone;
      TextInputEditText edtPhone = ViewBindings.findChildViewById(rootView, id);
      if (edtPhone == null) {
        break missingId;
      }

      id = R.id.edtSureName;
      TextInputEditText edtSureName = ViewBindings.findChildViewById(rootView, id);
      if (edtSureName == null) {
        break missingId;
      }

      id = R.id.edtUser;
      TextInputEditText edtUser = ViewBindings.findChildViewById(rootView, id);
      if (edtUser == null) {
        break missingId;
      }

      id = R.id.estFirstName;
      TextInputEditText estFirstName = ViewBindings.findChildViewById(rootView, id);
      if (estFirstName == null) {
        break missingId;
      }

      id = R.id.txtErrEmail;
      TextView txtErrEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtErrEmail == null) {
        break missingId;
      }

      id = R.id.txtErrFirstName;
      TextView txtErrFirstName = ViewBindings.findChildViewById(rootView, id);
      if (txtErrFirstName == null) {
        break missingId;
      }

      id = R.id.txtErrLastName;
      TextView txtErrLastName = ViewBindings.findChildViewById(rootView, id);
      if (txtErrLastName == null) {
        break missingId;
      }

      id = R.id.txtErrNation;
      TextView txtErrNation = ViewBindings.findChildViewById(rootView, id);
      if (txtErrNation == null) {
        break missingId;
      }

      id = R.id.txtErrPass;
      TextView txtErrPass = ViewBindings.findChildViewById(rootView, id);
      if (txtErrPass == null) {
        break missingId;
      }

      id = R.id.txtErrPassConfirm;
      TextView txtErrPassConfirm = ViewBindings.findChildViewById(rootView, id);
      if (txtErrPassConfirm == null) {
        break missingId;
      }

      id = R.id.txtErrPhone;
      TextView txtErrPhone = ViewBindings.findChildViewById(rootView, id);
      if (txtErrPhone == null) {
        break missingId;
      }

      id = R.id.txtErrUser;
      TextView txtErrUser = ViewBindings.findChildViewById(rootView, id);
      if (txtErrUser == null) {
        break missingId;
      }

      return new FragmentSighnUpBinding((LinearLayout) rootView, edtEmailSignup, edtNation, edtPass,
          edtPassConfirm, edtPhone, edtSureName, edtUser, estFirstName, txtErrEmail,
          txtErrFirstName, txtErrLastName, txtErrNation, txtErrPass, txtErrPassConfirm, txtErrPhone,
          txtErrUser);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
