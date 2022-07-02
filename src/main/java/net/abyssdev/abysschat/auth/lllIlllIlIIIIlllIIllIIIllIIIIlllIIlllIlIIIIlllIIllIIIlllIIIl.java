package net.abyssdev.abysschat.auth;

import net.abyssdev.abysschat.AbyssChat;
import net.abyssdev.abysslib.text.Color;
import org.bukkit.Bukkit;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

@SuppressWarnings("all")
public class lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl {

    private static final String UNKNOWN = "%%_USER_%%";
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;

    private static boolean a10;
    private static boolean b10;
    private static boolean c10;
    private static boolean d10;
    private static boolean e10;
    private static boolean f10;
    private static boolean g10;
    private static boolean h10;
    private static boolean i10;
    private static boolean j10;
    private static boolean k10;
    private static boolean l10;
    private static boolean m10;
    private static boolean n10;
    private static boolean o10;
    private static boolean p10;
    private static boolean q10;
    private static boolean r10;
    private static boolean s10;
    private static boolean t10;
    private static boolean u10;
    private static boolean v10;
    private static boolean w10;
    private static boolean x10;
    private static boolean y10;
    private static boolean z10;

    private static boolean a20;
    private static boolean b20;
    private static boolean c20;
    private static boolean d20;
    private static boolean e20;
    private static boolean f20;
    private static boolean g20;
    private static boolean h20;
    private static boolean i20;
    private static boolean j20;
    private static boolean k20;
    private static boolean l20;
    private static boolean m20;
    private static boolean n20;
    private static boolean o20;
    private static boolean p20;
    private static boolean q20;
    private static boolean r20;
    private static boolean s20;
    private static boolean t20;
    private static boolean u20;
    private static boolean v20;
    private static boolean w20;
    private static boolean x20;
    private static boolean y20;
    private static boolean z20;

    private static boolean a30;
    private static boolean b30;
    private static boolean c30;
    private static boolean d30;
    private static boolean e30;
    private static boolean f30;
    private static boolean g30;
    private static boolean h30;
    private static boolean i30;
    private static boolean j30;
    private static boolean k30;
    private static boolean l30;
    private static boolean m30;
    private static boolean n30;
    private static boolean o30;
    private static boolean p30;
    private static boolean q30;
    private static boolean r30;
    private static boolean s30;
    private static boolean t30;
    private static boolean u30;
    private static boolean v30;
    private static boolean w30;
    private static boolean x30;
    private static boolean y30;
    private static boolean z30;

    private static String OS = System.getProperty("os.name").toLowerCase();
    private final Logger logger;
    private AbyssChat plugin;
    private String productKey;
    private String server;
    private String authorization;

    public lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl(AbyssChat plugin, String licenseKey) {
        this.plugin = plugin;
        this.productKey = licenseKey;
        this.logger = plugin.getLogger();
        this.server = "https://license.abyssdev.net/api/client";
        this.authorization = "d62579d568207452d40d773fabfce2c649896e3b";

        this.a();
    }

    public static void a(final AbyssChat plugin) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a10 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b10 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.u10 = true;

        a(plugin, "");
        b(plugin, "");
        c(plugin, "", 0, 0);
        d(plugin, "");
        e(plugin, 0);
        f(plugin, 0);
        g(plugin, 0, 0);
        i(plugin, new double[0][0]);
        j(plugin, new double[0][0], new int[0]);
    }

    public static boolean a(final AbyssChat plugin, String s) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.v10 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c10 = true;

        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; ++i) {
            if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
                lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d10 = true;
                b(plugin, s);
                return false;
            }
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d10 = true;
        b(plugin, s);
        return true;
    }

    public static boolean b(final AbyssChat plugin, String s) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e10 = true;
        for (int i = 1, length = s.length(); i < length; ++i) {
            if (s.charAt(i) != s.charAt(0)) {
                lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f10 = true;
                c(plugin, s, 0, 0);
                return false;
            }
        }

        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f10 = true;
        c(plugin, s, 0, 0);
        return true;
    }

    public static String c(final AbyssChat plugin, String n, int b1, int b2) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.g10 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.w10 = true;
        int decimalValue = 0, charB2;
        char charB1;
        String output = "";
        for (int i = 0; i < n.length(); i++) {
            charB1 = n.charAt(i);
            if (charB1 >= 'A' && charB1 <= 'Z') {
                charB2 = 10 + (charB1 - 'A');
            } else {
                charB2 = charB1 - '0';
            }
            decimalValue = decimalValue * b1 + charB2;
        }

        if (0 == decimalValue) {
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h10 = true;
            return d(plugin, n);
        }
        while (decimalValue != 0) {
            if (decimalValue % b2 < 10) {
                output = Integer.toString(decimalValue % b2) + output;
            } else {
                output = (char) ((decimalValue % b2) + 55) + output;
            }
            decimalValue /= b2;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h10 = true;
        return d(plugin, output);
    }

    public static String d(final AbyssChat plugin, String param) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.x10 = true;
        char[] d
                = new char[]{0x131, 0x130, 0xFC, 0xDC, 0xF6, 0xD6, 0x15F, 0x15E, 0xE7, 0xC7, 0x11F, 0x11E};
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.i10 = true;
        char[] f = new char[]{'i', 'I', 'u', 'U', 'o', 'O', 's', 'S', 'c', 'C', 'g', 'G'};
        for (int i = 0; i < d.length; i++) {
            param
                    = param.replaceAll(
                    new String(new char[]{d[i]}), new String(new char[]{f[i]}));
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.j10 = true;
        return e(plugin, param.length());
    }

    public static String e(final AbyssChat plugin, int binary) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.y10 = true;
        HashMap<Integer, String> hm = new HashMap<>();
        String hex = "";
        int i;
        for (i = 0; i < 10; i++) {
            hm.put(i, String.valueOf(i));
        }
        for (i = 10; i < 16; i++) {
            hm.put(i, String.valueOf((char) ('A' + i - 10)));
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.k10 = true;
        int currbit;
        while (binary != 0) {
            int code4 = 0;
            for (i = 0; i < 4; i++) {
                currbit = binary % 10;
                binary = binary / 10;
                code4 += currbit * Math.pow(2, i);
            }
            hex = hm.get(code4) + hex;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.l10 = true;
        return f(plugin, hex.length());
    }

    public static String f(final AbyssChat plugin, int binary) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.z10 = true;
        String octal = "";
        int currBit = 0, j = 1;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.m10 = true;
        while (binary != 0) {
            int code3 = 0;
            for (int i = 0; i < 3; i++) {
                currBit = binary % 10;
                binary = binary / 10;
                code3 += currBit * j;
                j *= 2;
            }
            octal = code3 + octal;
            j = 1;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.n10 = true;
        return g(plugin, octal.length(), 0).toString();
    }

    public static Long g(final AbyssChat plugin, long x, long y) {
        if (y == 0) {
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o10 = true;
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p10 = true;
            h(plugin);
            return 1L;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o10 = true;
        long val = x + y / 2;
        val *= val;
        if (y % 2 == 1) {
            val *= x;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p10 = true;
        i(plugin, new double[0][0]);
        return val;
    }

    public static void h(final AbyssChat plugin) {
        double[][] a = new double[0][0];
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.q10 = true;
        try {
            int n = a.length;
            double x[][] = new double[n][n];
            double b[][] = new double[n][n];
            int index[] = new int[n];
            for (int i = 0; i < n; ++i) {
                b[i][i] = 1;
            }

            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.r10 = true;

            for (int i = 0; i < n - 1; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    for (int k = 0; k < n; ++k) {
                        b[index[j]][k]
                                -= a[index[j]][i] * b[index[i]][k];
                    }
                }
            }
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.s10 = true;
            for (int i = 0; i < n; ++i) {
                x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
                for (int j = n - 2; j >= 0; --j) {
                    x[j][i] = b[index[j]][i];
                    for (int k = j + 1; k < n; ++k) {
                        x[j][i] -= a[index[j]][k] * x[k][i];
                    }
                    x[j][i] /= a[index[j]][j];
                }
            }
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.t10 = true;
        } catch (Exception exception) {
        }

        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a10) {
            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b10) {
                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c10) {
                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d10) {
                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e10) {
                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f10) {
                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.g10) {
                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h10) {
                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.i10) {
                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.j10) {
                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.k10) {
                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.l10) {
                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.m10) {
                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.n10) {
                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o10) {
                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p10) {
                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.q10) {
                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.r10) {
                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.s10) {
                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.t10) {
                                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.u10) {
                                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.v10) {
                                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.w10) {
                                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.x10) {
                                                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.y10) {
                                                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.z10) {
                                                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a) {
                                                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b) {
                                                                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c) {
                                                                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d) {
                                                                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e) {
                                                                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f) {
                                                                                                                                        // This is run first
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.g10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.i10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.j10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.k10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.l10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.m10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.n10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.q10 = false;
                                                                                                                                        //plugin.init();
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.r10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.s10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.t10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.u10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.v10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.w10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.x10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.y10 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.z10 = false;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        int[] b = new int[0];
        try {
            int n = b.length;
            double c[] = new double[n];

            for (int i = 0; i < n; ++i) {
                b[i] = i;
            }

            for (int i = 0; i < n; ++i) {
                double c1 = 0;
                for (int j = 0; j < n; ++j) {
                    double c0 = Math.abs(a[i][j]);
                    if (c0 > c1) {
                        c1 = c0;
                    }
                }
                c[i] = c1;
            }

            int k = 0;
            for (int j = 0; j < n - 1; ++j) {
                double pi1 = 0;
                for (int i = j; i < n; ++i) {
                    double pi0 = Math.abs(a[b[i]][j]);
                    pi0 /= c[b[i]];
                    if (pi0 > pi1) {
                        pi1 = pi0;
                        k = i;
                    }
                }
                int itmp = b[j];
                b[j] = b[k];
                b[k] = itmp;
                for (int i = j + 1; i < n; ++i) {
                    double pj = a[b[i]][j] / a[b[j]][j];
                    a[b[i]][j] = pj;
                    for (int l = j + 1; l < n; ++l) {
                        a[b[i]][l] -= pj * a[b[j]][l];
                    }
                }
            }
        } catch (Exception exception) {
        }
    }

    public static void ld3(final AbyssChat plugin) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a30 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b30 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.u30 = true;

        a3(plugin, "");
        b3(plugin, "");
        c3(plugin, "", 0, 0);
        d3(plugin, "");
        e3(plugin, 0);
        f3(plugin, 0);
        g3(plugin, 0, 0);
        i3(plugin, new double[0][0]);
        j3(plugin, new double[0][0], new int[0]);
    }

    public static boolean a3(final AbyssChat plugin, String s) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.v30 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c30 = true;
        for (int i = 1, length = s.length(); i < length; ++i) {
            if (s.charAt(i) != s.charAt(0)) {
                lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d30 = true;
                c3(plugin, s, 0, 0);
                return false;
            }
        }

        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d30 = true;
        b3(plugin, s);
        return true;
    }

    public static boolean b3(final AbyssChat plugin, String s) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e30 = true;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; ++i) {
            if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
                lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f30 = true;
                b3(plugin, s);
                return false;
            }
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f30 = true;
        c3(plugin, s, 0, 0);
        return true;
    }

    public static String c3(final AbyssChat plugin, String n, int b1, int b2) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.g30 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.w30 = true;
        int decimalValue = 0, charB2;
        char charB1;
        String output = "";
        for (int i = 0; i < n.length(); i++) {
            charB1 = n.charAt(i);
            if (charB1 >= 'A' && charB1 <= 'Z') {
                charB2 = 10 + (charB1 - 'A');
            } else {
                charB2 = charB1 - '0';
            }
            decimalValue = decimalValue * b1 + charB2;
        }

        if (0 == decimalValue) {
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h30 = true;
            return d3(plugin, n);
        }
        while (decimalValue != 0) {
            if (decimalValue % b2 < 10) {
                output = Integer.toString(decimalValue % b2) + output;
            } else {
                output = (char) ((decimalValue % b2) + 55) + output;
            }
            decimalValue /= b2;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h30 = true;
        return d3(plugin, output);
    }

    public static String d3(final AbyssChat plugin, String param) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.x30 = true;
        char[] d
                = new char[]{0x131, 0x130, 0xFC, 0xDC, 0xF6, 0xD6, 0x15F, 0x15E, 0xE7, 0xC7, 0x11F, 0x11E};
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.i30 = true;
        char[] f = new char[]{'i', 'I', 'u', 'U', 'o', 'O', 's', 'S', 'c', 'C', 'g', 'G'};
        for (int i = 0; i < d.length; i++) {
            param
                    = param.replaceAll(
                    new String(new char[]{d[i]}), new String(new char[]{f[i]}));
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.j30 = true;
        return e3(plugin, param.length());
    }

    public static String e3(final AbyssChat plugin, int binary) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.y30 = true;
        HashMap<Integer, String> hm = new HashMap<>();
        String hex = "";
        int i;
        for (i = 0; i < 10; i++) {
            hm.put(i, String.valueOf(i));
        }
        for (i = 10; i < 16; i++) {
            hm.put(i, String.valueOf((char) ('A' + i - 10)));
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.k30 = true;
        int currbit;
        while (binary != 0) {
            int code4 = 0;
            for (i = 0; i < 4; i++) {
                currbit = binary % 10;
                binary = binary / 10;
                code4 += currbit * Math.pow(2, i);
            }
            hex = hm.get(code4) + hex;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.l30 = true;
        return f3(plugin, hex.length());
    }

    public static String f3(final AbyssChat plugin, int binary) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.z30 = true;
        String octal = "";
        int currBit = 0, j = 1;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.m30 = true;
        while (binary != 0) {
            int code3 = 0;
            for (int i = 0; i < 3; i++) {
                currBit = binary % 10;
                binary = binary / 10;
                code3 += currBit * j;
                j *= 2;
            }
            octal = code3 + octal;
            j = 1;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.n30 = true;
        return g3(plugin, octal.length(), 0).toString();
    }

    public static Long g3(final AbyssChat plugin, long x, long y) {
        if (y == 0) {
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o30 = true;
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p30 = true;
            h3(plugin);
            return 1L;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o30 = true;
        long val = x + y / 2;
        val *= val;
        if (y % 2 == 1) {
            val *= x;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p30 = true;
        i3(plugin, new double[0][0]);
        return val;
    }


    public static void h3(final AbyssChat plugin) {
        double[][] a = new double[0][0];
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.q30 = true;
        try {
            int n = a.length;
            double x[][] = new double[n][n];
            double b[][] = new double[n][n];
            int index[] = new int[n];
            for (int i = 0; i < n; ++i) {
                b[i][i] = 1;
            }

            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.r30 = true;

            for (int i = 0; i < n - 1; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    for (int k = 0; k < n; ++k) {
                        b[index[j]][k]
                                -= a[index[j]][i] * b[index[i]][k];
                    }
                }
            }
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.s30 = true;
            for (int i = 0; i < n; ++i) {
                x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
                for (int j = n - 2; j >= 0; --j) {
                    x[j][i] = b[index[j]][i];
                    for (int k = j + 1; k < n; ++k) {
                        x[j][i] -= a[index[j]][k] * x[k][i];
                    }
                    x[j][i] /= a[index[j]][j];
                }
            }
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.t30 = true;
        } catch (Exception exception) {
        }

        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a30) {
            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b30) {
                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c30) {
                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d30) {
                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e30) {
                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f30) {
                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.g30) {
                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h30) {
                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.i30) {
                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.j30) {
                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.k30) {
                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.l30) {
                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.m30) {
                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.n30) {
                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o30) {
                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p30) {
                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.q30) {
                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.r30) {
                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.s30) {
                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.t30) {
                                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.u30) {
                                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.v30) {
                                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.w30) {
                                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.x30) {
                                                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.y30) {
                                                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.z30) {
                                                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a) {
                                                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b) {
                                                                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c) {
                                                                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d) {
                                                                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e) {
                                                                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f) {
                                                                                                                                        // Run third
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.g30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.i30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.j30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.k30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.l30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.m30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.n30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.q30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.r30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.s30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.t30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.u30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.v30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.w30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.x30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.y30 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.z30 = false;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        int[] b = new int[0];
        try {
            int n = b.length;
            double c[] = new double[n];

            for (int i = 0; i < n; ++i) {
                b[i] = i;
            }

            for (int i = 0; i < n; ++i) {
                double c1 = 0;
                for (int j = 0; j < n; ++j) {
                    double c0 = Math.abs(a[i][j]);
                    if (c0 > c1) {
                        c1 = c0;
                    }
                }
                c[i] = c1;
            }

            int k = 0;
            for (int j = 0; j < n - 1; ++j) {
                double pi1 = 0;
                for (int i = j; i < n; ++i) {
                    double pi0 = Math.abs(a[b[i]][j]);
                    pi0 /= c[b[i]];
                    if (pi0 > pi1) {
                        pi1 = pi0;
                        k = i;
                    }
                }
                int itmp = b[j];
                b[j] = b[k];
                b[k] = itmp;
                for (int i = j + 1; i < n; ++i) {
                    double pj = a[b[i]][j] / a[b[j]][j];
                    a[b[i]][j] = pj;
                    for (int l = j + 1; l < n; ++l) {
                        a[b[i]][l] -= pj * a[b[j]][l];
                    }
                }
            }
        } catch (Exception exception) {
        }
    }

    public static double[][] i3(final AbyssChat plugin, double a[][]) {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i][i] = 1;
        }

        j3(plugin, a, index);

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    b[index[j]][k]
                            -= a[index[j]][i] * b[index[i]][k];
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        j3(plugin, x, new int[0]);
        return x;
    }

    public static void j3(final AbyssChat plugin, double a[][], int index[]) {
        int n = index.length;
        double c[] = new double[n];

        for (int i = 0; i < n; ++i) {
            index[i] = i;
        }

        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) {
                    c1 = c0;
                }
            }
            c[i] = c1;
        }
        h3(plugin);
        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];
                a[index[i]][j] = pj;
                for (int l = j + 1; l < n; ++l) {
                    a[index[i]][l] -= pj * a[index[j]][l];
                }
            }
        }
    }

    public static double[][] i(final AbyssChat plugin, double a[][]) {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i][i] = 1;
        }

        j(plugin, a, index);

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    b[index[j]][k]
                            -= a[index[j]][i] * b[index[i]][k];
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        j(plugin, x, new int[0]);
        return x;
    }

    public static void j(final AbyssChat plugin, double a[][], int index[]) {
        int n = index.length;
        double c[] = new double[n];

        for (int i = 0; i < n; ++i) {
            index[i] = i;
        }

        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) {
                    c1 = c0;
                }
            }
            c[i] = c1;
        }
        h(plugin);
        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];
                a[index[i]][j] = pj;
                for (int l = j + 1; l < n; ++l) {
                    a[index[i]][l] -= pj * a[index[j]][l];
                }
            }
        }
    }

    public static void z1(final AbyssChat plugin) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a20 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b20 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.u20 = true;

        a1(plugin, "");
        b1(plugin, "");
        c1(plugin, "", 0, 0);
        d1(plugin, "");
        e1(plugin, 0);
        f1(plugin, 0);
        g1(plugin, 0, 0);
        i1(plugin, new double[0][0]);
        j1(plugin, new double[0][0], new int[0]);
    }

    public static boolean a1(final AbyssChat plugin, String s) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.v20 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c20 = true;
        for (int i = 1, length = s.length(); i < length; ++i) {
            if (s.charAt(i) != s.charAt(0)) {
                lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d20 = true;
                c1(plugin, s, 0, 0);
                return false;
            }
        }

        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d20 = true;
        b1(plugin, s);
        return true;
    }

    public static boolean b1(final AbyssChat plugin, String s) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e20 = true;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; ++i) {
            if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
                lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f20 = true;
                b1(plugin, s);
                return false;
            }
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f20 = true;
        c1(plugin, s, 0, 0);
        return true;
    }

    //Spoofed methods to trick cracker

    // # %%__USER_ID__%%

    public static String c1(final AbyssChat plugin, String n, int b1, int b2) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.g20 = true;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.w20 = true;
        int decimalValue = 0, charB2;
        char charB1;
        String output = "";
        for (int i = 0; i < n.length(); i++) {
            charB1 = n.charAt(i);
            if (charB1 >= 'A' && charB1 <= 'Z') {
                charB2 = 10 + (charB1 - 'A');
            } else {
                charB2 = charB1 - '0';
            }
            decimalValue = decimalValue * b1 + charB2;
        }

        if (0 == decimalValue) {
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h20 = true;
            return d(plugin, n);
        }
        while (decimalValue != 0) {
            if (decimalValue % b2 < 10) {
                output = Integer.toString(decimalValue % b2) + output;
            } else {
                output = (char) ((decimalValue % b2) + 55) + output;
            }
            decimalValue /= b2;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h20 = true;
        return d1(plugin, output);
    }

    public static String d1(final AbyssChat plugin, String param) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.x20 = true;
        char[] d
                = new char[]{0x131, 0x130, 0xFC, 0xDC, 0xF6, 0xD6, 0x15F, 0x15E, 0xE7, 0xC7, 0x11F, 0x11E};
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.i20 = true;
        char[] f = new char[]{'i', 'I', 'u', 'U', 'o', 'O', 's', 'S', 'c', 'C', 'g', 'G'};
        for (int i = 0; i < d.length; i++) {
            param
                    = param.replaceAll(
                    new String(new char[]{d[i]}), new String(new char[]{f[i]}));
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.j20 = true;
        return e1(plugin, param.length());
    }

    public static String e1(final AbyssChat plugin, int binary) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.y20 = true;
        HashMap<Integer, String> hm = new HashMap<>();
        String hex = "";
        int i;
        for (i = 0; i < 10; i++) {
            hm.put(i, String.valueOf(i));
        }
        for (i = 10; i < 16; i++) {
            hm.put(i, String.valueOf((char) ('A' + i - 10)));
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.k20 = true;
        int currbit;
        while (binary != 0) {
            int code4 = 0;
            for (i = 0; i < 4; i++) {
                currbit = binary % 10;
                binary = binary / 10;
                code4 += currbit * Math.pow(2, i);
            }
            hex = hm.get(code4) + hex;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.l20 = true;
        return f1(plugin, hex.length());
    }

    public static String f1(final AbyssChat plugin, int binary) {
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.z20 = true;
        String octal = "";
        int currBit = 0, j = 1;
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.m20 = true;
        while (binary != 0) {
            int code3 = 0;
            for (int i = 0; i < 3; i++) {
                currBit = binary % 10;
                binary = binary / 10;
                code3 += currBit * j;
                j *= 2;
            }
            octal = code3 + octal;
            j = 1;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.n20 = true;
        return g1(plugin, octal.length(), 0).toString();
    }

    public static Long g1(final AbyssChat plugin, long x, long y) {
        if (y == 0) {
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o20 = true;
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p20 = true;
            h1(plugin);
            return 1L;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o20 = true;
        long val = x + y / 2;
        val *= val;
        if (y % 2 == 1) {
            val *= x;
        }
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p20 = true;
        i1(plugin, new double[0][0]);
        return val;
    }

    public static void h1(final AbyssChat plugin) {
        double[][] a = new double[0][0];
        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.q20 = true;
        try {
            int n = a.length;
            double x[][] = new double[n][n];
            double b[][] = new double[n][n];
            int index[] = new int[n];
            for (int i = 0; i < n; ++i) {
                b[i][i] = 1;
            }

            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.r20 = true;

            for (int i = 0; i < n - 1; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    for (int k = 0; k < n; ++k) {
                        b[index[j]][k]
                                -= a[index[j]][i] * b[index[i]][k];
                    }
                }
            }
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.s20 = true;
            for (int i = 0; i < n; ++i) {
                x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
                for (int j = n - 2; j >= 0; --j) {
                    x[j][i] = b[index[j]][i];
                    for (int k = j + 1; k < n; ++k) {
                        x[j][i] -= a[index[j]][k] * x[k][i];
                    }
                    x[j][i] /= a[index[j]][j];
                }
            }
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.t20 = true;
        } catch (Exception exception) {
        }

        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a20) {
            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b20) {
                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c20) {
                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d20) {
                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e20) {
                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f20) {
                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.g20) {
                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h20) {
                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.i20) {
                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.j20) {
                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.k20) {
                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.l20) {
                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.m20) {
                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.n20) {
                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o20) {
                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p20) {
                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.q20) {
                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.r20) {
                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.s20) {
                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.t20) {
                                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.u20) {
                                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.v20) {
                                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.w20) {
                                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.x20) {
                                                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.y20) {
                                                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.z20) {
                                                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a) {
                                                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b) {
                                                                                                                        if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c) {
                                                                                                                            if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d) {
                                                                                                                                if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e) {
                                                                                                                                    if (lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f) {
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.g20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.h20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.i20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.j20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.k20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.l20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.m20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.n20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.o20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.p20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.q20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.r20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.s20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.t20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.u20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.v20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.w20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.x20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.y20 = false;
                                                                                                                                        lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.z20 = false;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        int[] b = new int[0];
        try {
            int n = b.length;
            double c[] = new double[n];

            for (int i = 0; i < n; ++i) {
                b[i] = i;
            }

            for (int i = 0; i < n; ++i) {
                double c1 = 0;
                for (int j = 0; j < n; ++j) {
                    double c0 = Math.abs(a[i][j]);
                    if (c0 > c1) {
                        c1 = c0;
                    }
                }
                c[i] = c1;
            }

            int k = 0;
            for (int j = 0; j < n - 1; ++j) {
                double pi1 = 0;
                for (int i = j; i < n; ++i) {
                    double pi0 = Math.abs(a[b[i]][j]);
                    pi0 /= c[b[i]];
                    if (pi0 > pi1) {
                        pi1 = pi0;
                        k = i;
                    }
                }
                int itmp = b[j];
                b[j] = b[k];
                b[k] = itmp;
                for (int i = j + 1; i < n; ++i) {
                    double pj = a[b[i]][j] / a[b[j]][j];
                    a[b[i]][j] = pj;
                    for (int l = j + 1; l < n; ++l) {
                        a[b[i]][l] -= pj * a[b[j]][l];
                    }
                }
            }
        } catch (Exception exception) {
        }
    }

    public static double[][] i1(final AbyssChat plugin, double a[][]) {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i][i] = 1;
        }

        j1(plugin, a, index);

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    b[index[j]][k]
                            -= a[index[j]][i] * b[index[i]][k];
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        j1(plugin, x, new int[0]);
        return x;
    }

    public static void j1(final AbyssChat plugin, double a[][], int index[]) {
        int n = index.length;
        double c[] = new double[n];

        for (int i = 0; i < n; ++i) {
            index[i] = i;
        }

        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) {
                    c1 = c0;
                }
            }
            c[i] = c1;
        }
        h1(plugin);
        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];
                a[index[i]][j] = pj;
                for (int l = j + 1; l < n; ++l) {
                    a[index[i]][l] -= pj * a[index[j]][l];
                }
            }
        }
    }

    public void a() {
        final byte[] in = new byte[0];
        final int iOff = 0;
        final int iLen = 0;

        int oDataLen = (iLen * 4 + 2) / 3;
        char[] map1 = {};
        int oLen = ((iLen + 2) / 3) * 4;
        char[] out = new char[oLen];
        int ip = iOff;
        int iEnd = iOff + iLen;
        int op = 0;
        while (ip < iEnd) {
            int i0 = in[ip++] & 0xff;
            int i1 = ip < iEnd ? in[ip++] & 0xff : 0;
            int i2 = ip < iEnd ? in[ip++] & 0xff : 0;
            int o0 = i0 >>> 2;
            int o1 = ((i0 & 3) << 4) | (i1 >>> 4);
            int o2 = ((i1 & 0xf) << 2) | (i2 >>> 6);
            int o3 = i2 & 0x3F;
            out[op++] = map1[o0];
            out[op++] = map1[o1];
            out[op] = op < oDataLen ? map1[o2] : '=';
            op++;
            out[op] = op < oDataLen ? map1[o3] : '=';
            op++;
        }
        this.b();
    }

    public void b() {
        this.c();
    }

    public void c() {
        this.d();
    }

    public void d() {
        this.e();
    }

    public void e() {
        this.f();
    }

    public void f() {
        this.g();
    }

    public void g() {
        this.h();
    }

    public void h() {
        this.i();
    }

    public void i() {
        this.j();
    }

    public void j() {
        this.k();
    }

    public void k() {
        this.l();
    }

    public void l() {
        final long timeMs = System.currentTimeMillis();
        String response;
        try {
            URL url = new URL(server);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", "uLicense");
            con.setDoInput(true);
            con.setDoOutput(true);
            con.setUseCaches(false);

            String hwid;
            try {
                if (OS.contains("win")) {
                    Runtime runtime = Runtime.getRuntime();
                    Process process = runtime.exec(new String[]{"wmic", "csproduct", "get", "UUID"});

                    String result = null;
                    InputStream is = process.getInputStream();
                    Scanner sc = new Scanner(process.getInputStream());
                    try {
                        while (sc.hasNext()) {
                            String next = sc.next();
                            if (next.contains("UUID")) {
                                result = sc.next().trim();
                                break;
                            }
                        }
                    } finally {
                        is.close();
                    }

                    if (result == null) {
                        //this.logger.info("Could not find hardware id.");
                    }

                    // hash
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(result.getBytes());
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwid = stringBuilder.toString();
                } else if (OS.contains("mac")) {
                    NetworkInterface networkInterface = NetworkInterface.getByName("en0");
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(hardwareAddress);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwid = stringBuilder.toString();
                } else if (OS.contains("inux")) {
                    File machineId = new File("/var/lib/dbus/machine-id");

                    if (!machineId.exists()) {
                        machineId = new File("/etc/machine-id");
                    }

                    if (!machineId.exists()) {
                        //this.logger.info("Could not find hardware id.");
                    }

                    Scanner scanner = null;
                    try {
                        scanner = new Scanner(machineId);
                        String id = scanner.useDelimiter("\\A").next();
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        byte[] digested = messageDigest.digest(id.getBytes());
                        StringBuilder stringBuilder = new StringBuilder();
                        for (byte singleByte : digested) {
                            stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                        }

                        hwid = stringBuilder.toString();
                    } finally {
                        if (scanner != null) {
                            scanner.close();
                        }
                    }
                } else {
                    //this.logger.info("Could not find hardware id.");
                }
            } catch (Exception e) {
                //this.logger.info("Could not find hardware id.");
            }


            String hwidv2 = "Unknown";
            try {
                if (OS.contains("win")) {
                    Runtime runtime = Runtime.getRuntime();
                    Process process = runtime.exec(new String[]{"wmic", "csproduct", "get", "UUID"});

                    String result = null;
                    InputStream is = process.getInputStream();
                    Scanner sc = new Scanner(process.getInputStream());
                    try {
                        while (sc.hasNext()) {
                            String next = sc.next();
                            if (next.contains("UUID")) {
                                result = sc.next().trim();
                                break;
                            }
                        }
                    } finally {
                        is.close();
                    }

                    if (result == null) {
                        //this.logger.info("Could not find hardware id.");
                    }

                    // hash
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(result.getBytes());
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwidv2 = stringBuilder.toString();
                } else if (OS.contains("mac")) {
                    NetworkInterface networkInterface = NetworkInterface.getByName("en0");
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(hardwareAddress);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwidv2 = stringBuilder.toString();
                } else if (OS.contains("inux")) {
                    File machineId = new File("/var/lib/dbus/machine-id");

                    if (!machineId.exists()) {
                        machineId = new File("/etc/machine-id");
                    }

                    if (!machineId.exists()) {
                        //this.logger.info("Could not find hardware id.");
                    }

                    Scanner scanner = null;
                    try {
                        scanner = new Scanner(machineId);
                        String id = scanner.useDelimiter("\\A").next();
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        byte[] digested = messageDigest.digest(id.getBytes());
                        StringBuilder stringBuilder = new StringBuilder();
                        for (byte singleByte : digested) {
                            stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                        }

                        hwidv2 = stringBuilder.toString();
                    } finally {
                        if (scanner != null) {
                            scanner.close();
                        }
                    }
                } else {
                    //this.logger.info("Could not find hardware id.");
                }
            } catch (Exception e) {
                //this.logger.info("Could not find hardware id.");
            }

            String outString = "{\"hwid\":\"password\",\"licensekey\":\"avain\",\"product\":\"NiceCar\",\"version\":\"dogpoop\"}";
            //Align HWID again here if someone tries to spoof it
            outString = outString
                    .replaceAll("password", hwidv2)
                    .replaceAll("avain", productKey)
                    .replaceAll("NiceCar", this.plugin.getName())
                    .replaceAll("dogpoop", this.plugin.getDescription().getVersion());

            byte[] out = outString.getBytes(StandardCharsets.UTF_8);

            con.setRequestProperty("Authorization", this.authorization);
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.connect();

            try (OutputStream os = con.getOutputStream()) {
                os.write(out);
            }

            if (!url.getHost().equals(con.getURL().getHost())) {
                response = "successful_authentication";
            }

            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                StringBuilder responseBuilder = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    responseBuilder.append(inputLine);
                }

                response = responseBuilder.toString();
            }

            if (!response.contains("{")) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                        "&7&oYour license is invalid!",
                        " ",
                        "&8&m---------------------------------"
                ).forEach(msg -> this.logger.info(Color.parse(msg)));
                System.exit(0);
                return;
            }

            String hash = null;
            String version = null;

            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a = true;
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(response);
            String status = json.get("status_overview").toString();

            if (status.contains("success")) {
                hash = json.get("status_id").toString();
                version = json.get("version").toString();
            }

            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.b = true;
            if (hash != null && version != null) {
                String[] aa = hash.split("694201337");

                String hashed = aa[0];

                String decoded = new String(Base64.getDecoder().decode(hashed));

                if (!decoded.equals(productKey.substring(0, 2) + productKey.substring(productKey.length() - 2) + authorization.substring(0, 2))) {
                    Arrays.asList(
                            "&8&m---------------------------------",
                            " ",
                            "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                            "&7&oYour license is invalid!",
                            " ",
                            "&8&m---------------------------------"
                    ).forEach(msg -> this.logger.info(Color.parse(msg)));
                    System.exit(0);
                    return;
                }

                String time = String.valueOf(Instant.now().getEpochSecond());
                String unix = time.substring(0, time.length() - 2);

                long t = Long.parseLong(unix);
                long hashT = Long.parseLong(aa[1]);

                if (Math.abs(t - hashT) > 1) {
                    Arrays.asList(
                            "&8&m---------------------------------",
                            " ",
                            "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                            "&7&oYour license is invalid!",
                            " ",
                            "&8&m---------------------------------"
                    ).forEach(msg -> this.logger.info(Color.parse(msg)));
                    System.exit(0);
                    return;
                }
            }

            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.c = true;
            int statusLength = status.length();

            boolean outdated = false;
            if (version != null && !version.equals(this.plugin.getDescription().getVersion())
                    && status.contains("success") && response.contains("success")
                    && String.valueOf(statusLength).equals("7")) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&b" + this.plugin.getName() + " &8| &b" + this.plugin.getDescription().getVersion(),
                        "&7&oSuccessfully &f&ovalidated&7&o license!",
                        " ",
                        "&3* &bYou are on an outdated version! &7(&f" + version + "&7)",
                        " ",
                        "&8&m---------------------------------"
                ).forEach(msg -> this.logger.info(Color.parse(msg)));
                outdated = true;
            }

            statusLength = status.length();

            if (!isValidLength(statusLength)) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                        "&7&oYour license is invalid!",
                        " ",
                        "&8&m---------------------------------"
                ).forEach(msg -> this.logger.info(Color.parse(msg)));
                System.exit(0);
                return;
            }

            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.d = true;
            final boolean valid = status.contains("success") && response.contains("success") && String.valueOf(statusLength).equals("7");

            if (!valid) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                        "&7&oYour license is invalid!",
                        " ",
                        "&8&m---------------------------------"
                ).forEach(msg -> this.logger.info(Color.parse(msg)));
                System.exit(0);
                return;
            }

            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.e = true;


            if (!outdated) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&b" + this.plugin.getName() + " &8| &b" + this.plugin.getDescription().getVersion(),
                        "&7&oSuccessfully &f&ovalidated&7&o license!",
                        " ",
                        "&8&m---------------------------------"
                ).forEach(msg -> this.logger.info(Color.parse(msg)));
            }

            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.f = true;

            HashMap<Integer, String> hm = new HashMap<>();
            String hex = "";
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.a(this.plugin);
            int i;
            for (i = 0; i < 10; i++) {
                hm.put(i, String.valueOf(i));
            }
            for (i = 10; i < 16; i++) {
                hm.put(i, String.valueOf((char) ('A' + i - 10)));
            }
            int bin = 0 / ThreadLocalRandom.current().nextInt(1, 1000);
            int currbit;
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.z1(this.plugin);
            while (bin != 0) {
                int code4 = 0;
                for (i = 0; i < 4; i++) {
                    currbit = bin % 10;
                    bin = bin / 10;
                    code4 += currbit * Math.pow(2, i);
                }
                hex = hm.get(code4) + hex;
            }
            lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl.ld3(this.plugin);

            this.logger.info("Loaded plugin in " + (System.currentTimeMillis() - timeMs) + "ms");
        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
            this.logger.info("Your license is invalid. Please change your license, or contact the plugin developer.");
            System.exit(0);
        }
    }

    private String validateAndLoadMethodsAndShutdown(String productKey) throws IOException {
        URL url = new URL(server);
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", "uLicense");
        con.setDoInput(true);
        con.setDoOutput(true);
        con.setUseCaches(false);

        String hwid;
        try {
            if (OS.contains("win")) {
                Runtime runtime = Runtime.getRuntime();
                Process process = runtime.exec(new String[]{"wmic", "csproduct", "get", "UUID"});

                String result = null;
                InputStream is = process.getInputStream();
                Scanner sc = new Scanner(process.getInputStream());
                try {
                    while (sc.hasNext()) {
                        String next = sc.next();
                        if (next.contains("UUID")) {
                            result = sc.next().trim();
                            break;
                        }
                    }
                } finally {
                    is.close();
                }

                if (result == null) {
                    //this.logger.info("Could not find hardware id.");
                }

                // hash
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] digested = messageDigest.digest(result.getBytes());
                StringBuilder stringBuilder = new StringBuilder();
                for (byte singleByte : digested) {
                    stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                }

                hwid = stringBuilder.toString();
            } else if (OS.contains("mac")) {
                NetworkInterface networkInterface = NetworkInterface.getByName("en0");
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] digested = messageDigest.digest(hardwareAddress);
                StringBuilder stringBuilder = new StringBuilder();
                for (byte singleByte : digested) {
                    stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                }

                hwid = stringBuilder.toString();
            } else if (OS.contains("inux")) {
                File machineId = new File("/var/lib/dbus/machine-id");

                if (!machineId.exists()) {
                    machineId = new File("/etc/machine-id");
                }

                if (!machineId.exists()) {
                    //this.logger.info("Could not find hardware id.");
                }

                Scanner scanner = null;
                try {
                    scanner = new Scanner(machineId);
                    String id = scanner.useDelimiter("\\A").next();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(id.getBytes());
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwid = stringBuilder.toString();
                } finally {
                    if (scanner != null) {
                        scanner.close();
                    }
                }
            } else {
                //this.logger.info("Could not find hardware id.");
            }
        } catch (Exception e) {
            //this.logger.info("Could not find hardware id.");
        }


        String hwidv2 = "Unknown";
        try {
            if (OS.contains("win")) {
                Runtime runtime = Runtime.getRuntime();
                Process process = runtime.exec(new String[]{"wmic", "csproduct", "get", "UUID"});

                String result = null;
                InputStream is = process.getInputStream();
                Scanner sc = new Scanner(process.getInputStream());
                try {
                    while (sc.hasNext()) {
                        String next = sc.next();
                        if (next.contains("UUID")) {
                            result = sc.next().trim();
                            break;
                        }
                    }
                } finally {
                    is.close();
                }

                if (result == null) {
                    //this.logger.info("Could not find hardware id.");
                }

                // hash
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] digested = messageDigest.digest(result.getBytes());
                StringBuilder stringBuilder = new StringBuilder();
                for (byte singleByte : digested) {
                    stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                }

                hwidv2 = stringBuilder.toString();
            } else if (OS.contains("mac")) {
                NetworkInterface networkInterface = NetworkInterface.getByName("en0");
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] digested = messageDigest.digest(hardwareAddress);
                StringBuilder stringBuilder = new StringBuilder();
                for (byte singleByte : digested) {
                    stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                }

                hwidv2 = stringBuilder.toString();
            } else if (OS.contains("inux")) {
                File machineId = new File("/var/lib/dbus/machine-id");

                if (!machineId.exists()) {
                    machineId = new File("/etc/machine-id");
                }

                if (!machineId.exists()) {
                    //this.logger.info("Could not find hardware id.");
                }

                Scanner scanner = null;
                try {
                    scanner = new Scanner(machineId);
                    String id = scanner.useDelimiter("\\A").next();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(id.getBytes());
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwidv2 = stringBuilder.toString();
                } finally {
                    if (scanner != null) {
                        scanner.close();
                    }
                }
            } else {
                //this.logger.info("Could not find hardware id.");
            }
        } catch (Exception e) {
            //this.logger.info("Could not find hardware id.");
        }

        String outString = "{\"hwid\":\"password\",\"licensekey\":\"avain\",\"product\":\"NiceCar\",\"version\":\"dogpoop\"}";
        //Align HWID again here if someone tries to spoof it
        outString = outString
                .replaceAll("password", hwidv2)
                .replaceAll("avain", productKey)
                .replaceAll("NiceCar", this.plugin.getName())
                .replaceAll("dogpoop", this.plugin.getDescription().getVersion());

        byte[] out = outString.getBytes(StandardCharsets.UTF_8);

        con.setRequestProperty("Authorization", this.authorization);
        con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        con.connect();

        try (OutputStream os = con.getOutputStream()) {
            os.write(out);
        }

        if (!url.getHost().equals(con.getURL().getHost())) return "successful_authentication";

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            return response.toString();
        }
    }

    public boolean isValidLength(int reps) {
        return reps == 7;
    }

    public boolean isValidLength22(int reps) {
        return reps == 11;
    }

    public boolean isValidLength222(int reps) {
        return reps == 44;
    }

    public boolean isValidLength2222(int reps) {
        return reps == 48;
    }

}