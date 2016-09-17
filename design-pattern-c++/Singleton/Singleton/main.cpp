#include "Singleton.h"

void main()
{
	SingletonV1* s11 = SingletonV1::getInstance();
	SingletonV1* s12 = SingletonV1::getInstance();

	if(s11 == s12){
		cout<<"s11 == s12"<<endl;
	}else{
		cout<<"s11 != s12"<<endl;
	}
	SingletonV1::destory();

	const SingletonV2* s21 = SingletonV2::getInstance();
	const SingletonV2* s22 = SingletonV2::getInstance();

	if(s21 == s22){
		cout<<"s21 == s22"<<endl;
	}else{
		cout<<"s21 != s22"<<endl;
	}
	SingletonV2::destory();
}