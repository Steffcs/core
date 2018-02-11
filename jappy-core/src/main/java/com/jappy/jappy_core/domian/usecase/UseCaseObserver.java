package com.jappy.jappy_core.domian.usecase;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by irenecedeno on 06-02-18.
 */

public abstract class UseCaseObserver<T> extends DisposableObserver<T> {
    @Override public void onNext(T value) {}
    @Override public void onError(Throwable e) {}
    @Override public void onComplete() {}
}