package cn.xiaobei56.designmodel.a;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Name: DesignModel
 * Package Name: cn.xiaobei56.designmodel.a
 * Author: bzb
 * Date: 2021/10/29
 * Description:  被观察的实例
 */
public class RealObservable implements BObservable {
    List<BObserver> observers;
    ObserverData observerData;

    public RealObservable() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(BObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(BObserver observer) {
        if (!observers.isEmpty()) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(observerData);
        }
    }
    
    public void updateData(ObserverData data) {
        this.observerData = data;
        notifyAllObserver();
    }
}

