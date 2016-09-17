#include "Singleton.h"

SingletonV2* SingletonV2::instance = new SingletonV2;
SingletonV1* SingletonV1::instance = NULL;

SingletonV1::SingletonV1(void)
{
	cout<< "SingletonV1 create" << endl;
}

SingletonV1* SingletonV1::getInstance(void)
{
	if(instance == NULL)
	{
		instance = new SingletonV1;
	}
	return instance;
}

SingletonV1::~SingletonV1(void)
{
}


void SingletonV1::destory()
{
	if(instance != NULL){
		delete instance;
		instance = NULL;
		cout<< "SingletonV1 destory" << endl;
	}
}

SingletonV2::SingletonV2(void)
{
	cout<< "SingletonV2 create" << endl;
}

SingletonV2::~SingletonV2(void)
{
}

SingletonV2* SingletonV2::getInstance(void)
{
	return instance;
}

void SingletonV2::destory()
{
	if(instance != NULL){
		delete instance;
		instance = NULL;
		cout<< "SingletonV2 destory" << endl;
	}
}