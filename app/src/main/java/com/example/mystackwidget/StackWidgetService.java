package com.example.mystackwidget;

import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViewsService;

public class StackWidgetService extends RemoteViewsService {

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StackRemoteViewsFactory(this.getApplicationContext());
    }
}
