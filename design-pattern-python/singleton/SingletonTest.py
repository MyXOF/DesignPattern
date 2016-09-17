import queue
from singleton.Singleton import *


class Test(object):
    """Test whether the class Singleton works"""
    def __init__(self, tnum=3):
        self.tnum = tnum
        self.queue_st = queue.Queue()
        self.queue_nst = queue.Queue()

    def run(self):
        threads_s = [threading.Thread(target=self._run_st) for i in range(self.tnum)]
        for t in threads_s:
            t.start()
            t.join()

        threads_ns = [threading.Thread(target=self._run_nst) for i in range(self.tnum)]
        for t in threads_ns:
            t.start()
            t.join()

    def _run_st(self):
        # thread-safe case
        obj = SingletonV2()
        self.queue_st.put(obj)

    def _run_nst(self):
        # not-thread-safe case
        obj = SingletonV1()
        self.queue_nst.put(obj)


if __name__ == '__main__':
    test = Test(tnum=10)
    test.run()
    objs_st = []
    while not test.queue_st.empty():
        objs_st.append(test.queue_st.get())
    last = objs_st.pop()
    for obj in objs_st:
        if not last == obj:
            print('NOT IDENTICAL')
            break
        else:
            print('IDENTICAL')
    print("--------------")
    objs_nst = []
    while not test.queue_nst.empty():
        objs_nst.append(test.queue_nst.get())
    last = objs_nst.pop()
    for obj in objs_nst:
        if not last == obj:
            print('NOT IDENTICAL')
            break
        else:
            print('IDENTICAL')