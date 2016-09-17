import threading


class SingletonV1(object):
    def __new__(cls, *args, **kwargs):
        if not hasattr(cls,"_instance"):
            cls._instance = super(SingletonV1,cls).__new__(cls, *args, **kwargs)
        return cls._instance

    def __init__(self):
        pass


class SingletonV2(object):
    _lock = threading.Lock()
    _instance = None

    def __init__(self):
        pass

    def __new__(cls, *args, **kwargs):
        # use double check to ensure cls._instance is not None
        if not cls._instance:
            with cls._lock:
                if not cls._instance:
                    cls._instance = super(SingletonV2,cls).__new__(cls, *args, **kwargs)
        return cls._instance

