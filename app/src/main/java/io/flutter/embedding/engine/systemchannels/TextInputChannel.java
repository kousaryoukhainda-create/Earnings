package io.flutter.embedding.engine.systemchannels;

import android.os.Bundle;
import androidx.annotation.NonNull;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.TextEditingDelta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class TextInputChannel {
    private static final String TAG = "TextInputChannel";
    @NonNull
    public final MethodChannel channel;
    @NonNull
    final MethodChannel.MethodCallHandler parsingMethodHandler;
    private TextInputMethodHandler textInputMethodHandler;

    /* loaded from: classes2.dex */
    public static class Configuration {
        public final String actionLabel;
        public final boolean autocorrect;
        public final Autofill autofill;
        public final String[] contentCommitMimeTypes;
        public final boolean enableDeltaModel;
        public final boolean enableIMEPersonalizedLearning;
        public final boolean enableSuggestions;
        public final Configuration[] fields;
        public final Integer inputAction;
        @NonNull
        public final InputType inputType;
        public final boolean obscureText;
        @NonNull
        public final TextCapitalization textCapitalization;

        /* loaded from: classes2.dex */
        public static class Autofill {
            public final TextEditState editState;
            public final String hintText;
            public final String[] hints;
            public final String uniqueIdentifier;

            public Autofill(@NonNull String str, @NonNull String[] strArr, String str2, @NonNull TextEditState textEditState) {
                this.uniqueIdentifier = str;
                this.hints = strArr;
                this.hintText = str2;
                this.editState = textEditState;
            }

            @NonNull
            public static Autofill fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
                String string;
                String string2 = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                if (jSONObject.isNull("hintText")) {
                    string = null;
                } else {
                    string = jSONObject.getString("hintText");
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = translateAutofillHint(jSONArray.getString(i));
                }
                return new Autofill(string2, strArr, string, TextEditState.fromJson(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
                if (r17.equals("familyName") == false) goto L7;
             */
            @androidx.annotation.NonNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String translateAutofillHint(@androidx.annotation.NonNull java.lang.String r17) {
                /*
                    Method dump skipped, instructions count: 802
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill.translateAutofillHint(java.lang.String):java.lang.String");
            }
        }

        public Configuration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NonNull TextCapitalization textCapitalization, @NonNull InputType inputType, Integer num, String str, Autofill autofill, String[] strArr, Configuration[] configurationArr) {
            this.obscureText = z;
            this.autocorrect = z2;
            this.enableSuggestions = z3;
            this.enableIMEPersonalizedLearning = z4;
            this.enableDeltaModel = z5;
            this.textCapitalization = textCapitalization;
            this.inputType = inputType;
            this.inputAction = num;
            this.actionLabel = str;
            this.autofill = autofill;
            this.contentCommitMimeTypes = strArr;
            this.fields = configurationArr;
        }

        @NonNull
        public static Configuration fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            Configuration[] configurationArr;
            JSONArray jSONArray;
            String string;
            String string2 = jSONObject.getString("inputAction");
            if (string2 != null) {
                Autofill autofill = null;
                if (!jSONObject.isNull("fields")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("fields");
                    int length = jSONArray2.length();
                    Configuration[] configurationArr2 = new Configuration[length];
                    for (int i = 0; i < length; i++) {
                        configurationArr2[i] = fromJson(jSONArray2.getJSONObject(i));
                    }
                    configurationArr = configurationArr2;
                } else {
                    configurationArr = null;
                }
                Integer inputActionFromTextInputAction = inputActionFromTextInputAction(string2);
                ArrayList arrayList = new ArrayList();
                if (jSONObject.isNull("contentCommitMimeTypes")) {
                    jSONArray = null;
                } else {
                    jSONArray = jSONObject.getJSONArray("contentCommitMimeTypes");
                }
                if (jSONArray != null) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList.add(jSONArray.optString(i2));
                    }
                }
                boolean optBoolean = jSONObject.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject.optBoolean("enableDeltaModel");
                TextCapitalization fromValue = TextCapitalization.fromValue(jSONObject.getString("textCapitalization"));
                InputType fromJson = InputType.fromJson(jSONObject.getJSONObject("inputType"));
                if (jSONObject.isNull("actionLabel")) {
                    string = null;
                } else {
                    string = jSONObject.getString("actionLabel");
                }
                if (!jSONObject.isNull("autofill")) {
                    autofill = Autofill.fromJson(jSONObject.getJSONObject("autofill"));
                }
                return new Configuration(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, fromValue, fromJson, inputActionFromTextInputAction, string, autofill, (String[]) arrayList.toArray(new String[arrayList.size()]), configurationArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L3;
         */
        @androidx.annotation.NonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.Integer inputActionFromTextInputAction(@androidx.annotation.NonNull java.lang.String r12) {
            /*
                r0 = 7
                r1 = 6
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r12.getClass()
                r6 = 1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r8 = 0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                r10 = -1
                int r11 = r12.hashCode()
                switch(r11) {
                    case -810971940: goto L75;
                    case -737377923: goto L6c;
                    case -737089298: goto L61;
                    case -737080013: goto L56;
                    case -736940669: goto L4b;
                    case 469250275: goto L40;
                    case 1241689507: goto L35;
                    case 1539450297: goto L2a;
                    case 2110497650: goto L1e;
                    default: goto L1b;
                }
            L1b:
                r6 = -1
                goto L7f
            L1e:
                java.lang.String r6 = "TextInputAction.previous"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L27
                goto L1b
            L27:
                r6 = 8
                goto L7f
            L2a:
                java.lang.String r6 = "TextInputAction.newline"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L33
                goto L1b
            L33:
                r6 = 7
                goto L7f
            L35:
                java.lang.String r6 = "TextInputAction.go"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L3e
                goto L1b
            L3e:
                r6 = 6
                goto L7f
            L40:
                java.lang.String r6 = "TextInputAction.search"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L49
                goto L1b
            L49:
                r6 = 5
                goto L7f
            L4b:
                java.lang.String r6 = "TextInputAction.send"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L54
                goto L1b
            L54:
                r6 = 4
                goto L7f
            L56:
                java.lang.String r6 = "TextInputAction.none"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L5f
                goto L1b
            L5f:
                r6 = 3
                goto L7f
            L61:
                java.lang.String r6 = "TextInputAction.next"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L6a
                goto L1b
            L6a:
                r6 = 2
                goto L7f
            L6c:
                java.lang.String r8 = "TextInputAction.done"
                boolean r12 = r12.equals(r8)
                if (r12 != 0) goto L7f
                goto L1b
            L75:
                java.lang.String r6 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L7e
                goto L1b
            L7e:
                r6 = 0
            L7f:
                switch(r6) {
                    case 0: goto La3;
                    case 1: goto L9e;
                    case 2: goto L99;
                    case 3: goto L98;
                    case 4: goto L93;
                    case 5: goto L8e;
                    case 6: goto L89;
                    case 7: goto L88;
                    case 8: goto L83;
                    default: goto L82;
                }
            L82:
                return r9
            L83:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
                return r12
            L88:
                return r7
            L89:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L8e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L93:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L98:
                return r7
            L99:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L9e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            La3:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.inputActionFromTextInputAction(java.lang.String):java.lang.Integer");
        }
    }

    /* loaded from: classes2.dex */
    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;
        @NonNull
        public final TextInputType type;

        public InputType(@NonNull TextInputType textInputType, boolean z, boolean z2) {
            this.type = textInputType;
            this.isSigned = z;
            this.isDecimal = z2;
        }

        @NonNull
        public static InputType fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            return new InputType(TextInputType.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* loaded from: classes2.dex */
    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        
        @NonNull
        private final String encodedName;

        TextCapitalization(@NonNull String str) {
            this.encodedName = str;
        }

        public static TextCapitalization fromValue(@NonNull String str) throws NoSuchFieldException {
            TextCapitalization[] values;
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException(AbstractC2437ph.g("No such TextCapitalization: ", str));
        }
    }

    /* loaded from: classes2.dex */
    public static class TextEditState {
        public final int composingEnd;
        public final int composingStart;
        public final int selectionEnd;
        public final int selectionStart;
        @NonNull
        public final String text;

        public TextEditState(@NonNull String str, int i, int i2, int i3, int i4) throws IndexOutOfBoundsException {
            if ((i == -1 && i2 == -1) || (i >= 0 && i2 >= 0)) {
                if ((i3 == -1 && i4 == -1) || (i3 >= 0 && i3 <= i4)) {
                    if (i4 <= str.length()) {
                        if (i <= str.length()) {
                            if (i2 <= str.length()) {
                                this.text = str;
                                this.selectionStart = i;
                                this.selectionEnd = i2;
                                this.composingStart = i3;
                                this.composingEnd = i4;
                                return;
                            }
                            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i2));
                        }
                        throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
                    }
                    throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i3));
                }
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            }
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i2) + ")");
        }

        @NonNull
        public static TextEditState fromJson(@NonNull JSONObject jSONObject) throws JSONException {
            return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean hasComposing() {
            int i = this.composingStart;
            if (i >= 0 && this.composingEnd > i) {
                return true;
            }
            return false;
        }

        public boolean hasSelection() {
            if (this.selectionStart >= 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public interface TextInputMethodHandler {
        void clearClient();

        void finishAutofillContext(boolean z);

        void hide();

        void requestAutofill();

        void sendAppPrivateCommand(@NonNull String str, @NonNull Bundle bundle);

        void setClient(int i, @NonNull Configuration configuration);

        void setEditableSizeAndTransform(double d, double d2, @NonNull double[] dArr);

        void setEditingState(@NonNull TextEditState textEditState);

        void setPlatformViewClient(int i, boolean z);

        void show();
    }

    /* loaded from: classes2.dex */
    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");
        
        @NonNull
        private final String encodedName;

        TextInputType(@NonNull String str) {
            this.encodedName = str;
        }

        public static TextInputType fromValue(@NonNull String str) throws NoSuchFieldException {
            TextInputType[] values;
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException(AbstractC2437ph.g("No such TextInputType: ", str));
        }
    }

    public TextInputChannel(@NonNull DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.TextInputChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                Bundle bundle;
                if (TextInputChannel.this.textInputMethodHandler == null) {
                    return;
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                Log.v(TextInputChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1779068172:
                        if (str.equals("TextInput.setPlatformViewClient")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1015421462:
                        if (str.equals("TextInput.setEditingState")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -37561188:
                        if (str.equals("TextInput.setClient")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 270476819:
                        if (str.equals("TextInput.hide")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 270803918:
                        if (str.equals("TextInput.show")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 649192816:
                        if (str.equals("TextInput.sendAppPrivateCommand")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1204752139:
                        if (str.equals("TextInput.setEditableSizeAndTransform")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1727570905:
                        if (str.equals("TextInput.finishAutofillContext")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1904427655:
                        if (str.equals("TextInput.clearClient")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 2113369584:
                        if (str.equals("TextInput.requestAutofill")) {
                            c = '\t';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            TextInputChannel.this.textInputMethodHandler.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            result.success(null);
                            return;
                        } catch (JSONException e) {
                            result.error("error", e.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            TextInputChannel.this.textInputMethodHandler.setEditingState(TextEditState.fromJson((JSONObject) obj));
                            result.success(null);
                            return;
                        } catch (JSONException e2) {
                            result.error("error", e2.getMessage(), null);
                            return;
                        }
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            TextInputChannel.this.textInputMethodHandler.setClient(jSONArray.getInt(0), Configuration.fromJson(jSONArray.getJSONObject(1)));
                            result.success(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e3) {
                            result.error("error", e3.getMessage(), null);
                            return;
                        }
                    case 3:
                        TextInputChannel.this.textInputMethodHandler.hide();
                        result.success(null);
                        return;
                    case 4:
                        TextInputChannel.this.textInputMethodHandler.show();
                        result.success(null);
                        return;
                    case 5:
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 != null && !string2.isEmpty()) {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            } else {
                                bundle = null;
                            }
                            TextInputChannel.this.textInputMethodHandler.sendAppPrivateCommand(string, bundle);
                            result.success(null);
                            return;
                        } catch (JSONException e4) {
                            result.error("error", e4.getMessage(), null);
                            return;
                        }
                    case 6:
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d = jSONObject3.getDouble("width");
                            double d2 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i = 0; i < 16; i++) {
                                dArr[i] = jSONArray2.getDouble(i);
                            }
                            TextInputChannel.this.textInputMethodHandler.setEditableSizeAndTransform(d, d2, dArr);
                            result.success(null);
                            return;
                        } catch (JSONException e5) {
                            result.error("error", e5.getMessage(), null);
                            return;
                        }
                    case 7:
                        TextInputChannel.this.textInputMethodHandler.finishAutofillContext(((Boolean) obj).booleanValue());
                        result.success(null);
                        return;
                    case '\b':
                        TextInputChannel.this.textInputMethodHandler.clearClient();
                        result.success(null);
                        return;
                    case '\t':
                        TextInputChannel.this.textInputMethodHandler.requestAutofill();
                        result.success(null);
                        return;
                    default:
                        result.notImplemented();
                        return;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    private static HashMap<Object, Object> createEditingDeltaJSON(ArrayList<TextEditingDelta> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<TextEditingDelta> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSON());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> createEditingStateJSON(String str, int i, int i2, int i3, int i4) {
        HashMap<Object, Object> o = AbstractC0324Hi.o("text", str);
        AbstractC0324Hi.t(i, o, "selectionBase", i2, "selectionExtent");
        AbstractC0324Hi.t(i3, o, "composingBase", i4, "composingExtent");
        return o;
    }

    public void commitContent(int i, Map<String, Object> map) {
        Log.v(TAG, "Sending 'commitContent' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.commitContent", map));
    }

    public void done(int i) {
        Log.v(TAG, "Sending 'done' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.done"));
    }

    public void go(int i) {
        Log.v(TAG, "Sending 'go' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.go"));
    }

    public void newline(int i) {
        Log.v(TAG, "Sending 'newline' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.newline"));
    }

    public void next(int i) {
        Log.v(TAG, "Sending 'next' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.next"));
    }

    public void performPrivateCommand(int i, @NonNull String str, @NonNull Bundle bundle) {
        HashMap o = AbstractC0324Hi.o("action", str);
        if (bundle != null) {
            HashMap hashMap = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            o.put("data", hashMap);
        }
        this.channel.invokeMethod("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i), o));
    }

    public void previous(int i) {
        Log.v(TAG, "Sending 'previous' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.previous"));
    }

    public void requestExistingInputState() {
        this.channel.invokeMethod("TextInputClient.requestExistingInputState", null);
    }

    public void search(int i) {
        Log.v(TAG, "Sending 'search' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.search"));
    }

    public void send(int i) {
        Log.v(TAG, "Sending 'send' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.send"));
    }

    public void setTextInputMethodHandler(TextInputMethodHandler textInputMethodHandler) {
        this.textInputMethodHandler = textInputMethodHandler;
    }

    public void unspecifiedAction(int i) {
        Log.v(TAG, "Sending 'unspecified' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.unspecified"));
    }

    public void updateEditingState(int i, @NonNull String str, int i2, int i3, int i4, int i5) {
        StringBuilder j = AbstractC0324Hi.j(i2, "Sending message to update editing state: \nText: ", str, "\nSelection start: ", "\nSelection end: ");
        AbstractC2437ph.u(j, i3, "\nComposing start: ", i4, "\nComposing end: ");
        j.append(i5);
        Log.v(TAG, j.toString());
        this.channel.invokeMethod("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i), createEditingStateJSON(str, i2, i3, i4, i5)));
    }

    public void updateEditingStateWithDeltas(int i, @NonNull ArrayList<TextEditingDelta> arrayList) {
        Log.v(TAG, "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i), createEditingDeltaJSON(arrayList)));
    }

    public void updateEditingStateWithTag(int i, @NonNull HashMap<String, TextEditState> hashMap) {
        Log.v(TAG, "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, TextEditState> entry : hashMap.entrySet()) {
            TextEditState value = entry.getValue();
            hashMap2.put(entry.getKey(), createEditingStateJSON(value.text, value.selectionStart, value.selectionEnd, -1, -1));
        }
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i), hashMap2));
    }
}
