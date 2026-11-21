package bitpit.launcher.backend.push.fcm.model;

import b.OkhdZkC3NYLW;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceRegistrationRequest {
    public static final Companion Companion = new Companion();
    public final DeviceRegistration S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return DeviceRegistrationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeviceRegistrationRequest(int i, DeviceRegistration deviceRegistration) {
        if ((i & 1) == 0) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = null;
        } else {
            this.S1zP5M3X7Ukq3ROlZ87G9I = deviceRegistration;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceRegistrationRequest) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, ((DeviceRegistrationRequest) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final int hashCode() {
        DeviceRegistration deviceRegistration = this.S1zP5M3X7Ukq3ROlZ87G9I;
        if (deviceRegistration == null) {
            return 0;
        }
        return deviceRegistration.hashCode();
    }

    public final String toString() {
        return "DeviceRegistrationRequest(update=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ')';
    }
}
