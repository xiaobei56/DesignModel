package cn.xiaobei56.designmodel.a;

/**
 * Project Name: DesignModel
 * Package Name: cn.xiaobei56.designmodel.a
 * Author: bzb
 * Date: 2021/10/29
 * Description:  被观察者
 */
public interface BObservable {
    void registerObserver(BObserver observer);

    void removeObserver(BObserver observer);

    void notifyAllObserver();
}
