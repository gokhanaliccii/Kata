package com.gokhanaliccii.kata.reactive;

import org.junit.Test;
import rx.Observable;
import rx.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

public class ActivityTest {

    @Test
    public void should_notifyWhenStateChanged() throws InterruptedException {
        Activity.SavedState dummyState = new Activity.SavedState();
        dummyState.setName("gokhan");

        Activity activity = new Activity();
        activity.setDummyState(dummyState);

        Observable.interval(1, TimeUnit.SECONDS)
                .map(a-> activity.isStateSaved())
                .distinctUntilChanged()
                .map(isSaved -> "saved state: " + isSaved)
                .subscribeOn(Schedulers.newThread())
                .subscribe(System.out::println);

        TimeUnit.SECONDS.sleep(3);
        dummyState.setSurname("gokhan");

        TimeUnit.SECONDS.sleep(4);
        dummyState.setSurname(null);

        TimeUnit.SECONDS.sleep(4);
        dummyState.setSurname("null");

        TimeUnit.SECONDS.sleep(10);
    }

}