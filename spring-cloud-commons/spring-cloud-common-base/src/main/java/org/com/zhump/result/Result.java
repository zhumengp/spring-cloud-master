package org.com.zhump.result;


/**
 * The class Wrap mapper.
 *
 * @author paascloud.net@gmail.com
 */
public class Result {

	/**
	 * Instantiates a new wrap mapper.
	 */
	private Result() {
	}

	/**
	 * Wrap.
	 *
	 * @param <E>     the element type
	 * @param code    the code
	 * @param msg the message
	 * @param o       the o
	 *
	 * @return the wrapper
	 */
	public static <E> BaseResult<E> wrap(int code, String msg, E o) {
		return new BaseResult<>(code, msg, o);
	}

	/**
	 * Wrap.
	 *
	 * @param <E>     the element type
	 * @param code    the code
	 * @param message the message
	 *
	 * @return the wrapper
	 */
	public static <E> BaseResult<E> wrap(int code, String message) {
		return wrap(code, message, null);
	}

	/**
	 * Wrap.
	 *
	 * @param <E>  the element type
	 * @param code the code
	 *
	 * @return the wrapper
	 */
	public static <E> BaseResult<E> wrap(int code) {
		return wrap(code, null);
	}

	/**
	 * Wrap.
	 *
	 * @param <E> the element type
	 * @param e   the e
	 *
	 * @return the wrapper
	 */
	public static <E> BaseResult<E> wrap(Exception e) {
		return new BaseResult<>(BaseResult.ERROR_CODE, e.getMessage());
	}

	/**
	 * Un wrapper.
	 *
	 * @param <E>     the element type
	 * @param wrapper the wrapper
	 *
	 * @return the e
	 */
	public static <E> E unWrap(BaseResult<E> wrapper) {
		return wrapper.getData();
	}

	/**
	 * Wrap ERROR. code=100
	 *
	 * @param <E> the element type
	 *
	 * @return the wrapper
	 */
	public static <E> BaseResult<E> illegalArgument() {
		return wrap(BaseResult.PARAMS_CODE, BaseResult.PARAMS_MSG);
	}

	/**
	 * Wrap ERROR. code=500
	 *
	 * @param <E> the element type
	 *
	 * @return the wrapper
	 */
	public static <E> BaseResult<E> error() {
		return wrap(BaseResult.ERROR_CODE, BaseResult.ERROR_MSG);
	}


	/**
	 * Error wrapper.
	 *
	 * @param <E>     the type parameter
	 * @param message the message
	 *
	 * @return the wrapper
	 */
	public static <E> BaseResult<E> error(String message) {
		return wrap(BaseResult.ERROR_CODE, message == null ? BaseResult.ERROR_MSG : message);
	}

	/**
	 * Wrap SUCCESS. code=200
	 *
	 * @param <E> the element type
	 *
	 * @return the wrapper
	 */
	public static <E> BaseResult<E> ok() {
		return new BaseResult<>();
	}

	/**
	 * Ok wrapper.
	 *
	 * @param <E> the type parameter
	 * @param o   the o
	 *
	 * @return the wrapper
	 */
	public static <E> BaseResult<E> ok(E o) {
		return new BaseResult<>(BaseResult.SUCCESS_CODE, BaseResult.SUCCESS_MSG, o);
	}
}
