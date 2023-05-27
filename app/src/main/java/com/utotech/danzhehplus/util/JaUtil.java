package com.utotech.danzhehplus.util;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Display;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import com.utotech.danzhehplus.R;

import net.gotev.speech.GoogleVoiceTypingDisabledException;
import net.gotev.speech.Logger;
import net.gotev.speech.Speech;
import net.gotev.speech.SpeechDelegate;
import net.gotev.speech.SpeechRecognitionNotAvailable;
import net.gotev.speech.SpeechUtil;
import net.gotev.speech.SupportedLanguagesListener;
import net.gotev.speech.TextToSpeechCallback;
import net.gotev.speech.UnsupportedReason;
import net.gotev.speech.ui.SpeechProgressView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class JaUtil {
    Context context;

    public JaUtil(Context context) {
        this.context = context;
    }

    private final int REQ_CODE_SPEECH = 100;

    public void tst(Activity activity) {
        Speech.init(context, context.getPackageName());
        Speech.getInstance().say("hello mother fucker");

        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en");
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Say Something");

        activity.startActivityForResult(intent, REQ_CODE_SPEECH);

    }
}







