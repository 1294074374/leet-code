package test.multithread.lock.公平锁和非公平锁;

/**
 * @author laijunlin
 * @date 2021-03-31 16:40
 * 公平锁,非公平锁
 * 公平锁: 非常公平,不能够插队,必须先来后到
 * 非公平锁: 非常不公平,可以插队(默认是非公平的)
 */
public class FairAndNoFairLock {
    //public ReentrantLock() {
    //    sync = new NonfairSync();
    //}
    //public ReentrantLock(boolean fair) {
    //    sync = fair ? new FairSync() : new NonfairSync();
    //}

}
