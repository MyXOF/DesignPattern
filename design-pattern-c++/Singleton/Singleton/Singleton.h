#pragma once
#include <iostream>
using namespace std;

class SingletonV1
{
private:
	static SingletonV1* instance;
	SingletonV1(void);

public:
	static SingletonV1* getInstance(void);
	static void destory(void);
	~SingletonV1(void);
};

class SingletonV2
{
private:
	static SingletonV2* instance;
	SingletonV2(void);

public:
	static SingletonV2* getInstance(void);
	~SingletonV2(void);
	static void destory(void);
};


