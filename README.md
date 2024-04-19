# آزمایش 3

## گام 1:

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>1</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>2</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>اضافه شدن این کلاس به پروژه</p>
</td>
<td width="292">
<p>اضافه شدن کلاس TelegramMessage که از کلاس Message ارث بری میکند</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>3</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع getter برای آیدی مبدا </p>
</td>
<td width="292">
<p>به وسیله این تابع به آیدی مبدا دسترسی داریم</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>4</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع getter برای آیدی مقصد </p>
</td>
<td width="292">
<p>به وسیله این تابع به آیدی مقصد دسترسی داریم</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>5</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع setter برای آیدی مبدا</p>
</td>
<td width="292">
<p>به وسیله این تابع میتوانیم آیدی مبدا را مشخص کنیم</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>6</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع setter برای آیدی مقصد</p>
</td>
<td width="292">
<p>به وسیله این تابع میتوانیم آیدی مقصد را مشخص کنیم</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>اضافه شدن این کلاس به پروژه</p>
</td>
<td width="292">
<p>اضافه شدن کلاس TelegramMessageService که واسط MessageService را پیاده سازی میکند</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>8</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن تابع sendSmsMessage</p>
</td>
<td width="292">
<p>به دلیل وجود آن در واسط باید باشد اما چون کاربردی در این کلاس ندارد بدنه آن خالی است</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>9</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن تابع sendEmailMessage</p>
</td>
<td width="292">
<p>به دلیل وجود آن در واسط باید باشد اما چون کاربردی در این کلاس ندارد بدنه آن خالی است</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>10</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن تابع sendTelegramMessage</p>
</td>
<td width="292">
<p>اگر آیدی درست بود اعلام میکند که پیام تلگرامی ارسال شده، درغیر این صورت ارور میدهد که آیدی درست نیست</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>11</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن تابع validateID</p>
</td>
<td width="292">
<p>با regex چک میکند که فرمت آیدی درست باشد</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>12</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>ایمپورت کردن کلاس های TelegramMessage و TelegramMessageService</p>
</td>
<td width="292">
<p>میخواهیم بتوانیم از این کلاسها استفاده کنیم</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>13</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>اضافه کردن گزینه پیام تلگرامی System.out.println("In order to send Telegram message enter 3")</p>
</td>
<td width="292">
<p>که کاربر بتواند از طریق کنسول این گزینه را نیز انتخاب کند</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>14</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p> اضافه کردن منطق گزینه پیام تلگرامی (case 3 در switch)</p>
</td>
<td width="292">
<p> که وقتی این گزینه انتخاب شد خروجی مربوطه نمایش داده شود</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>15</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>اضافه کردن منطق ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>با توجه به این که کاربر چه نوع پیامی را انتخاب کرده عملیات send 
 انجام میشود</p>
</td>
</tr>

</tbody>
</table>

مجموع تعداد تغییرات: 15

## گام ۲:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>کلاس Message به SRP پایبند است زیرا فقط محتوای پیام اصلی را مدیریت می کند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس های سرویس (EmailMessageService, SmsMessageService, TelegramMessageService) با ترکیب منطق ارسال پیام با validation، SRP را نقض می کنند.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>رابط "MessageService" با تعریف متدهایی ("sendSmsMessage"، "sendEmailMessage"، "sendTelegramMessage") بدون تغییر به OCP پایبند است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس های پیاده سازی سرویس (`EmailMessageService`, `SmsMessageService`, `TelegramMessageService`) با تغییر رفتار در هر کلاس (افزودن منطق validation) OCP را نقض می کنند.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس های «EmailMessage»، «SmsMessage» و «TelegramMessage» «Message» را گسترش می دهند و می توانند به جای یکدیگر در جایی که «Message» مورد انتظار است استفاده شوند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>متد های اجرای سرویس (`sendSmsMessage، `sendEmailMessage`, `sendTelegramMessage`)به زیرکلاس های خاصی از "Message" ("SmsMessage"، "EmailMessage"، "TelegramMessage") وابسته اند، که می تواند منجر به coupling و انعطاف پذیری کمتر شود.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>رابط «MessageService» به درستی با متد های خاصی برای هر نوع پیام تفکیک شده است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>پیاده سازی های سرویس ('EmailMessageService'، 'SmsMessageService'، 'TelegramMessageService') کل رابط 'MessageService' را اجرا می کنند، حتی اگر فقط از متد های خاصی استفاده می کنند.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>رابط MessageService یک انتزاع را نشان می دهد که اجزای سطح بالاتر (کلاس "Main") به آن بستگی دارند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس «Main» مستقیماً به پیاده سازی های مشخص («EmailMessageService»، «SmsMessageService»، «TelegramMessageService») بستگی دارد، نه فقط به انتزاع («MessageService»).</p>
</td>
</tr>
</tbody>
</table>

## گام ۳:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="246">
<p>کلاس Main مسئولیت‌های متعددی از جمله تعامل با کاربر، ایجاد پیام و ارسال پیام را بر عهده داشت.	</p>
</td>
<td width="284">
<p>مسئولیت‌ها را در کلاس‌های مختلفی مانند UserInteractionService، MessageCreationService و MessageSendingService تقسیم کردیم.
</p>
</td>
</tr>
<tr>
<td width="168">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td width="246">
<p>نوع‌های جدید پیام یا خدمات پیام‌رسانی نمی‌توانستند بدون تغییر کد موجود در کلاس Main اضافه شوند.	</p>
</td>
<td width="284">
<p>رابط‌ها را معرفی کردیم (مانند MessageService) و اجراها را انتزاعی کردیم.
</p>
</td>
</tr>
<tr>
<td width="168">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td width="246">
<p>زیرکلاس‌های Message نمی‌توانستند بدون تأثیر بر صحت برنامه جایگزین کلاس پایه شوند.	</p>
</td>
<td width="284">
<p>اطمینان حاصل کردیم که زیرکلاس‌ها (مانند SmsMessage، EmailMessage) قابلیت جایگزینی با Message را دارند.
</p>
</td>
</tr>
<tr>
<td width="168">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>رابط MessageService حاوی متدهایی بود که برای همه پیاده‌سازی‌ها لازم نبودند (مانند sendEmailMessage، sendSmsMessage).	</p>
</td>
<td width="284">
<p>رابط‌های متمرکز و متناسبی را ایجاد کردیم که فقط متدهای لازم برای هر پیاده‌سازی را شامل می‌شدند.
</p>
</td>
</tr>
<tr>
<td width="168">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td width="246">
<p>ماژول‌های سطح بالا (مانند کلاس Main) به پیاده‌سازی‌های محسوس (مانند SmsMessageService، EmailMessageService) وابسته بودند.	</p>
</td>
<td width="284">
<p>انتزاع‌ها را معرفی کردیم (مانند رابط MessageService) برای وابستگی‌ها، که اجازه آزمایش و انعطاف‌پذیری را فراهم می‌کند.
</p>
</td>
</tr>
</tbody>
</table>

## گام ۴:

#### در این صورت از انجام کدام یک از تغییرات ثبت شده در جدول گام ۱ معاف خواهید شد؟
1, 8, 9, 12, 13, 14, 15

#### تعداد تغییرات مورد نیاز، چند تغییر خواهد شد؟
از ۱۵ تغییر به ۸ تغییر کاهش می‌یابد. تقریبا با اعمال سالید تغییرات ۵۰ درصد کاهش یافته!

## گام ۵:
اعمال اصول SOLID به ما کمک کرده است که کدهای ما ماژولارتر، انعطاف‌پذیرتر و قابل نگهداری‌تر شود. با رعایت اصول SOLID:

1. **ماژولاریته:** هر کلاس یک مسئولیت تکی دارد که باعث می‌شود کد راحت‌تر قابل درک و تغییر باشد. این باعث کاهش کاپلینگ کدها می‌شود و سیستم را انعطاف‌پذیرتر می‌کند.

2. **انعطاف‌پذیری:** با رابط‌ها و انتزاع‌های خوب تعریف شده، کد ما باز برای اضافه کردن ویژگی‌ها است اما بسته برای تغییرات است. این به این معناست که می‌توانیم ویژگی‌های جدید را با 50% کمتر از تغییراتی که قبلاً انجام می‌شدند، اضافه کنیم.

3. **نگهداری:** با جدا کردن مسئولیت‌ها و انتزاع وابستگی‌ها، کد ما به راحتی قابل نگهداری و آزمون است. این باعث کاهش خطر ورود اشکالات و بهبود قابلیت نگهداری بلندمدت می‌شود.

4. با اعمال اصول SOLID، از چندریختی (Polymorphism) استفاده کرده‌ایم که به این معناست که اشیاء مختلفی با نوع Message می‌توانند به عنوان ورودی به سرویس‌های پیام (مانند SmsMessageService، EmailMessageService، TelegramMessageService) ارسال شوند. این اشیاء از نوع‌های مختلف Message مانند SmsMessage، EmailMessage و TelegramMessage هستند. استفاده از چندریختی امکان جایگزینی اشیاء مختلف در زمان اجرا را فراهم می‌کند، بدون نیاز به تغییر در کد.