/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.algebra;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.Function10;

public interface Monad10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, M extends HigherKinded10<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, M>> extends Functor10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, HigherKinded10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, M> {

    <U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, MONAD extends HigherKinded10<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, M>> Monad10<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, M> flatMap(javaslang.Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, MONAD> f);
}