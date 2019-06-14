package com.un.rx.main;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

class Main {

	public static final Consumer<Object> TEST_CONSUMER_NEXT = new Consumer<Object>() {
		@Override
		public void accept(Object s) throws Exception {
			System.out.println(s);
		}
	};

	public static final Consumer<Throwable> TEST_CONSUMER_ERROR = new Consumer<Throwable>() {
		@Override
		public void accept(Throwable s) throws Exception {
			System.out.println("error");
		}
	};

	public static final Action TEST_CONSUMER_CONPLETE = new Action() {
		@Override
		public void run() throws Exception {
			System.out.println("complete");
		}
	};

	public static final Consumer<Disposable> TEST_CONSUMER_SUB = new Consumer<Disposable>() {
		@Override
		public void accept(Disposable s) throws Exception {
			System.out.println("subcribe");
		}
	};

	static Object OBJ = new Object();

	public static void main(String[] args) {

		Observable<String> ob0 = Observable
				//自由创建数据处理方式
				//				.create(new ObservableOnSubscribe<Object>() {
				//					@Override
				//					public void subscribe(ObservableEmitter<Object> emitter) throws Exception {
				//
				//					}
				//				})
				//在订阅时决定数据
				//				.defer(new Callable<ObservableSource<?>>() {
				//					@Override
				//					public ObservableSource<?> call() throws Exception {
				//						return Observable.just("create defer");
				//					}
				//				})
				//空数据,执行complete
				//				.empty()
				//空数据
				//				.never()
				//空数据,执行error
				//				.error(new Throwable("create error"))
				//
				//				.just("Hello world")
				.fromArray("item0", "item1", "item2", "item3", "item44", "item55", "item2")
				//
				//				.range(9, 10)
				//				.rangeLong(Integer.MAX_VALUE, 10)
				//
				//				.fromCallable(new Callable<Object>() {
				//					@Override
				//					public Object call() throws Exception {
				//						return "fromCallable";
				//					}
				//				})
				//以固定时间间隔发送数据
				//				.interval(1, TimeUnit.SECONDS, Schedulers.trampoline())
				//延时发送数据
				//				.timer(2, TimeUnit.SECONDS, Schedulers.trampoline())
				//				.fromFuture()
				;
		Observable<String> ob1 = Observable.fromArray("combine0", "combine1");

		ob0
				//转换操作符
				//				.buffer(2,1)
				//
				//				.map(new Function<String, Integer>() {
				//					@Override
				//					public Integer apply(String s) throws Exception {
				//						return s.length();
				//					}
				//				})
				//
				//				.flatMap(new Function<String, ObservableSource<?>>() {
				//					@Override
				//					public ObservableSource<?> apply(String s) throws Exception {
				//						String ret = s + "flatMap";
				//						return Observable.just(ret, ret + 1);
				//					}
				//				})
				//
				//				.scan(new BiFunction<String, String, String>() {
				//					@Override
				//					public String apply(String s, String s2) throws Exception {
				//						return s + ";" + s2;
				//					}
				//				})
				//过滤操作符
				//过滤重复数据
				//				.distinct()
				//
				//				.filter(new Predicate<String>() {
				//					@Override
				//					public boolean test(String s) throws Exception {
				//						return s.length() > 5;
				//					}
				//				})
				//组合操作符
				//
				//				.mergeWith(Observable.just("conbine0", "conbine1", "conbine2"))
				//
				//				.startWith(ob1)
				.subscribe(
						TEST_CONSUMER_NEXT
						, TEST_CONSUMER_ERROR
						, TEST_CONSUMER_CONPLETE
						, TEST_CONSUMER_SUB
				);
	}
}
