package org.kodein.testmockmp

import org.kodein.mock.Mock
import org.kodein.mock.tests.TestsWithMocks
import kotlin.test.Test
import kotlin.test.assertEquals

class CommonGreetingTest : TestsWithMocks() {
    override fun setUpMocks() = injectMocks(mocker)

    @Mock
    lateinit var bar: Bar

    @Test
    fun testExample() {
        every { bar.foo } returns "Romain"
        assertEquals("Romain", bar.foo)
    }
}