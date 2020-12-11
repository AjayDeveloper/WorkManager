package com.exmple.workmanager.util;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import java.util.Random;

public class MyWorker  extends Worker {

    private static final String TAG = "MyWorker";


    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        Log.d(TAG, "doWork: number"+rand_int1);
        Log.d(TAG, "doWork: Thread "+Thread.currentThread().getId());
        return Result.success();
    }
}
