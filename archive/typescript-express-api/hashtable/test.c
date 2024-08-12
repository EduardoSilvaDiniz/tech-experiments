#include <stdio.h>

#define lambda(lambda$_ret, lambda$_args, lambda$_body)\
({\
lambda$_ret lambda$__anon$ lambda$_args\
lambda$_body\
&lambda$__anon$;\
})

void main()
{
    printf("%f\n", average_apply(lambda(float,(float x),{ return 2*x; })));
    printf("%f\n", average_apply(lambda(float,(float x),{ return x/3.0; })));
}