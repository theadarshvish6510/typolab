package bitpit.launcher.lock_screen;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.view.accessibility.AccessibilityEvent;
import b.lO3AzM6baEU;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class LockScreenService extends AccessibilityService {
    public static final lO3AzM6baEU Companion = new lO3AzM6baEU();
    public static WeakReference GO8WUug7ZWFCUI1zY;

    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onServiceConnected() {
        GO8WUug7ZWFCUI1zY = new WeakReference(this);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        GO8WUug7ZWFCUI1zY = null;
        return false;
    }
}
