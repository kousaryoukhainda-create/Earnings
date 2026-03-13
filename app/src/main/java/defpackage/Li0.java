package defpackage;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.common.api.Status;
import io.adjoe.sdk.internal.AdjoeActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* renamed from: Li0  reason: default package */
/* loaded from: classes2.dex */
public abstract class Li0 {
    public static void a(AdjoeActivity adjoeActivity, String str, String str2, String str3) {
        if (Eg0.b(str)) {
            Intrinsics.checkNotNullParameter("s2s_tracking", "category");
            C2521qg c2521qg = new C2521qg("s2s_tracking");
            c2521qg.e = "s2sClickUrl is missing";
            c2521qg.c("creativeSetUUID", str2);
            c2521qg.e();
            return;
        }
        C0335Ht c0335Ht = new C0335Ht(26);
        C1049ci0 c1049ci0 = C1049ci0.a;
        Rj0 c = C1049ci0.c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("CreativeSetUUID", str2);
        jSONObject.put("Timestamp", str3);
        c.p(new C0290Ga(str, c.v(adjoeActivity), (HashMap) null, jSONObject.toString()), true, new Lj0(c0335Ht, 2));
    }

    public static void b(AdjoeActivity adjoeActivity, String str, String str2, String str3, R70 r70) {
        if (Eg0.b(str)) {
            Intrinsics.checkNotNullParameter("s2s_tracking", "category");
            C2521qg c2521qg = new C2521qg("s2s_tracking");
            c2521qg.e = "s2sClickUrl is missing";
            c2521qg.c("creativeSetUUID", str2);
            c2521qg.e();
            return;
        }
        C1049ci0 c1049ci0 = C1049ci0.a;
        Rj0 c = C1049ci0.c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("CreativeSetUUID", str2);
        jSONObject.put("Timestamp", str3);
        c.p(new C0290Ga(str, c.v(adjoeActivity), (HashMap) null, jSONObject.toString()), true, new Lj0(new Ag0(2, r70, str2), 1));
    }

    public static byte[] c(String str) {
        if (str != null && !str.isEmpty()) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            int length = lowerCase.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (Character.digit(lowerCase.charAt(i2 + 1), 16) | (Character.digit(lowerCase.charAt(i2), 16) << 4));
            }
            return bArr;
        }
        return new byte[0];
    }

    public static Status d(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        if (asList.size() > 1) {
            return e((String) asList.get(0), (String) asList.get(1));
        }
        return e((String) asList.get(0), null);
    }

    public static Status e(String str, String str2) {
        int i;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c = 0;
                    break;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c = 1;
                    break;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c = 2;
                    break;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c = 3;
                    break;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c = 4;
                    break;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c = 5;
                    break;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c = 6;
                    break;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c = 7;
                    break;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c = '\b';
                    break;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c = '\t';
                    break;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c = '\n';
                    break;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    c = 11;
                    break;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c = '\f';
                    break;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c = '\r';
                    break;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c = 14;
                    break;
                }
                break;
            case -1368998244:
                if (str.equals("INVALID_HOSTING_LINK_DOMAIN")) {
                    c = 15;
                    break;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c = 16;
                    break;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c = 17;
                    break;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    c = 18;
                    break;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c = 19;
                    break;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c = 20;
                    break;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c = 21;
                    break;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c = 22;
                    break;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c = 23;
                    break;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c = 24;
                    break;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c = 25;
                    break;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c = 26;
                    break;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c = 27;
                    break;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c = 28;
                    break;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c = 29;
                    break;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c = 30;
                    break;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    c = 31;
                    break;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c = ' ';
                    break;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c = '!';
                    break;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c = '\"';
                    break;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c = '#';
                    break;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c = '$';
                    break;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c = '%';
                    break;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c = '&';
                    break;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c = '\'';
                    break;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c = '(';
                    break;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c = ')';
                    break;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c = '*';
                    break;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c = '+';
                    break;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c = ',';
                    break;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c = '-';
                    break;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c = '.';
                    break;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c = '/';
                    break;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c = '0';
                    break;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c = '1';
                    break;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c = '2';
                    break;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c = '3';
                    break;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c = '4';
                    break;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c = '5';
                    break;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c = '6';
                    break;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c = '7';
                    break;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c = '8';
                    break;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c = '9';
                    break;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c = ':';
                    break;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c = ';';
                    break;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c = '<';
                    break;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c = '=';
                    break;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c = '>';
                    break;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c = '?';
                    break;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c = '@';
                    break;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c = 'A';
                    break;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c = 'B';
                    break;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c = 'C';
                    break;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c = 'D';
                    break;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c = 'E';
                    break;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c = 'F';
                    break;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c = 'G';
                    break;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c = 'H';
                    break;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c = 'I';
                    break;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c = 'J';
                    break;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c = 'K';
                    break;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c = 'L';
                    break;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c = 'M';
                    break;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c = 'N';
                    break;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c = 'O';
                    break;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c = 'P';
                    break;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c = 'Q';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = 18001;
                break;
            case 1:
                i = 17033;
                break;
            case 2:
                i = 17057;
                break;
            case 3:
                i = 17091;
                break;
            case 4:
            case 31:
            case '@':
                i = 17004;
                break;
            case 5:
                i = 17068;
                break;
            case 6:
                i = 17052;
                break;
            case 7:
                i = 17061;
                break;
            case '\b':
                i = 17206;
                break;
            case '\t':
                i = 17200;
                break;
            case '\n':
                i = 17029;
                break;
            case 11:
                i = 17038;
                break;
            case '\f':
                i = 17030;
                break;
            case '\r':
                i = 17034;
                break;
            case 14:
                i = 17044;
                break;
            case 15:
                i = 17214;
                break;
            case 16:
                i = 17021;
                break;
            case 17:
                i = 17079;
                break;
            case 18:
                i = 18002;
                break;
            case 19:
                i = 17046;
                break;
            case 20:
                i = 17087;
                break;
            case 21:
            case 'I':
                i = 17008;
                break;
            case 22:
                i = 17085;
                break;
            case 23:
                i = 17094;
                break;
            case 24:
                i = 17064;
                break;
            case 25:
                i = 17016;
                break;
            case 26:
                i = 17084;
                break;
            case 27:
                i = 17035;
                break;
            case 28:
                i = 17014;
                break;
            case 29:
            case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                i = 17020;
                break;
            case 30:
                i = 17207;
                break;
            case ' ':
                i = 17203;
                break;
            case '!':
            case TokenParametersOuterClass$TokenParameters.ISRINGMUTED_FIELD_NUMBER /* 52 */:
                i = 17006;
                break;
            case '\"':
                i = 17062;
                break;
            case '#':
                i = 17088;
                break;
            case '$':
                i = 17082;
                break;
            case '%':
            case '(':
                i = 17011;
                break;
            case '&':
                i = 17056;
                break;
            case '\'':
                i = 17026;
                break;
            case ')':
                i = 17089;
                break;
            case TokenParametersOuterClass$TokenParameters.SECURECONTENT_FIELD_NUMBER /* 42 */:
                i = 17032;
                break;
            case TokenParametersOuterClass$TokenParameters.BATTERYCHARGING_FIELD_NUMBER /* 43 */:
                i = 17041;
                break;
            case TokenParametersOuterClass$TokenParameters.BATTERYLEVEL_FIELD_NUMBER /* 44 */:
                i = 17074;
                break;
            case TokenParametersOuterClass$TokenParameters.HEADSETPLUGGED_FIELD_NUMBER /* 45 */:
                i = 17081;
                break;
            case TokenParametersOuterClass$TokenParameters.BLUETOOTHPLUGGED_FIELD_NUMBER /* 46 */:
                i = 17095;
                break;
            case TokenParametersOuterClass$TokenParameters.FREESPACE_FIELD_NUMBER /* 47 */:
                i = 17007;
                break;
            case TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER /* 48 */:
                i = 17017;
                break;
            case TokenParametersOuterClass$TokenParameters.DARKMODE_FIELD_NUMBER /* 49 */:
                i = 17065;
                break;
            case '2':
                i = 17204;
                break;
            case TokenParametersOuterClass$TokenParameters.DNDMODE_FIELD_NUMBER /* 51 */:
                i = 17205;
                break;
            case TokenParametersOuterClass$TokenParameters.AMAZONID_FIELD_NUMBER /* 53 */:
                i = 17086;
                break;
            case TokenParametersOuterClass$TokenParameters.AAID_FIELD_NUMBER /* 54 */:
                i = 17075;
                break;
            case TokenParametersOuterClass$TokenParameters.APPBUILDVERSION_FIELD_NUMBER /* 55 */:
                i = 17083;
                break;
            case TokenParametersOuterClass$TokenParameters.SESSIONDURATION_FIELD_NUMBER /* 56 */:
                i = 17049;
                break;
            case TokenParametersOuterClass$TokenParameters.LASTADOMAINS_FIELD_NUMBER /* 57 */:
                i = 17071;
                break;
            case TokenParametersOuterClass$TokenParameters.LASTADVERTISEDBUNDLES_FIELD_NUMBER /* 58 */:
                i = 17002;
                break;
            case TokenParametersOuterClass$TokenParameters.PRIORCLICKS_FIELD_NUMBER /* 59 */:
                i = 17058;
                break;
            case TokenParametersOuterClass$TokenParameters.PRIORSKIP_FIELD_NUMBER /* 60 */:
                i = 17078;
                break;
            case TokenParametersOuterClass$TokenParameters.PRIORCLICKTYPES_FIELD_NUMBER /* 61 */:
                i = 17093;
                break;
            case TokenParametersOuterClass$TokenParameters.USERSESSIONS_FIELD_NUMBER /* 62 */:
                i = 17031;
                break;
            case TokenParametersOuterClass$TokenParameters.ABEXPERIMENTS_FIELD_NUMBER /* 63 */:
            case 'M':
                i = 17010;
                break;
            case 'A':
                i = 17000;
                break;
            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                i = 17009;
                break;
            case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                i = 17202;
                break;
            case TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER /* 69 */:
                i = 17051;
                break;
            case TokenParametersOuterClass$TokenParameters.COPPAAPPLIES_FIELD_NUMBER /* 70 */:
                i = 17043;
                break;
            case 'G':
                i = 17025;
                break;
            case 'H':
                i = 17201;
                break;
            case 'J':
                i = 17005;
                break;
            case 'K':
                i = 17042;
                break;
            case 'L':
                i = 17028;
                break;
            case 'N':
                i = 17040;
                break;
            case 'O':
                i = 17045;
                break;
            case 'P':
                i = 17090;
                break;
            case 'Q':
                i = 17073;
                break;
            default:
                i = 17499;
                break;
        }
        if (i == 17499) {
            if (str2 != null) {
                return new Status(i, AbstractC0324Hi.g(str, ":", str2));
            }
            return new Status(i, str);
        }
        return new Status(i, str2);
    }
}
