package com.usupov.productcard.service.impl;

import com.usupov.productcard.dto.CategoryDTO;
import com.usupov.productcard.model.Category;
import com.usupov.productcard.service.CategoryService;
import com.usupov.productcard.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {

    private static List<Category> category;

    @Autowired
    private PartService partService;

    static {

        category = new ArrayList<Category>(
            Arrays.asList(
                    new Category(
                            "Кузов",
                            Arrays.asList(
                                    new Category(
                                            "Автомобиль, передняя часть",
                                            Arrays.asList(
                                                    new Category(
                                                            "Буфер / составляющие",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Крыло/навесные части",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Колесная ниша",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Капот двигателя/составляющие/изоляция",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Кожух двигателя",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Переднее стекло",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Основная фара / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Основная фара / вставка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания основной фары",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Основная фара комплектующие",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Противотуманная фара / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Противотуманная фара / вставка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Противотуманная фара лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фара дальнего света / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания фара дальнего света",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь указателя поворота / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Фонарь указателя поворота",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Стояночный / габаритный огонь / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Стояночный огонь",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Габаритный огонь",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Детали крепления",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Крепление / держатель /рама",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Эмблемы",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Газовые пружины",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Спойлер",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Облицовка / решетка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Облицовка/защитная накладка",
                                                                            10
                                                                    )
                                                            )
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Кабина пассажира",
                                            Arrays.asList(
                                                    new Category(
                                                            "Накладки порога / двери",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Основание кузова",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Двери / составляющие",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Боковина",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Зеркала",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Топливный бак / комплектующие",
                                                            10
                                                    ),
                                                    new Category(
                                                            "дополнительный стоп-сигнал",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Детали крепления",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Облицовка/защитная накладка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Газовые пружины",
                                                                            10
                                                                    )
                                                            )
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Автомобиль, задняя часть",
                                            Arrays.asList(
                                                    new Category(
                                                            "Буфер / составляющие",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Задняя дверь / детали",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Крышка багажника/грузового багажника",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Капот двигателя/составляющие/изоляция",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Кожух двигателя",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Боковина",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Колесная ниша",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Топливный бак / комплектующие",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Задний фонарь / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Задний фонарь",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Габаритный огонь / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь сигнала торможения / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "дополнительный стоп-сигнал",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь указателя поворота / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Фонарь указателя поворота",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь освещения номерного знака / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Фонарь освещения номерного знака",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Задняя противотуманная фара / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фара заднего хода / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Стояночный / габаритный огонь / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Стояночный огонь",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Габаритный огонь",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Детали крепления",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Покрытие/покрышка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Спойлер",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Облицовка/защитная накладка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Газовые пружины",
                                                                            10
                                                                    )
                                                            )
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Детали кузова/крыло/буфер",
                                            Arrays.asList(
                                                    new Category(
                                                            "Буфер / составляющие",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Накладки порога / двери",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Крыло/навесные части",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Обшивка кузова",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Боковина",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Основание кузова",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Передняя решетка / обшивка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Продольная / поперечная балка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Вспомогательная рама/опора",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Колесная ниша",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Спойлер",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Покрытие/покрышка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Кронштейн батареи",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Крышки/капоты/двери/сдвижная крыша/складная крыша",
                                            Arrays.asList(
                                                    new Category(
                                                            "Двери / составляющие",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Крышка багажника/грузового багажника",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Капот двигателя/составляющие/изоляция",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Облицовка / защита / оформление / эмблемы / защита распыл.",
                                            Arrays.asList(
                                                    new Category(
                                                            "Облицовка/защитная накладка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Эмблемы",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Остекление / зеркала",
                                            Arrays.asList(
                                                    new Category(
                                                            "Остекление",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Оконные стекла",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Зеркала",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Основная фара / комплектующие",
                                            Arrays.asList(
                                                    new Category(
                                                            "Основная фара / вставка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Лампа накаливания основной фары",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Основная фара комплектующие",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Дополнительная фара/ комплектующие",
                                            Arrays.asList(
                                                    new Category(
                                                            "Противотуманная фара / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Противотуманная фара / вставка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Противотуманная фара лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фара дальнего света / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания фара дальнего света",
                                                                            10
                                                                    )
                                                            )
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Система освещения / сигнализация",
                                            Arrays.asList(
                                                    new Category(
                                                            "Задний фонарь / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Задний фонарь",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Габаритный огонь / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь сигнала торможения / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "дополнительный стоп-сигнал",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь указателя поворота / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Фонарь указателя поворота",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Боковой фонарь указателя поворота",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь освещения номерного знака / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Фонарь освещения номерного знака",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Задняя противотуманная фара / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фара заднего хода / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Стояночный / габаритный огонь / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Стояночный огонь",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Габаритный огонь",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь, установленный в двери",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Крепление / держатель /рама",
                                            10
                                    ),
                                    new Category(
                                            "Газовые пружины",
                                            10
                                    ),
                                    new Category(
                                            "Топливный бак / комплектующие",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Двигатель",
                            Arrays.asList(
                                    new Category(
                                            "Поиск артикула по графику",
                                            10
                                    ),
                                    new Category(
                                            "Прокладки",
                                            Arrays.asList(
                                                    new Category(
                                                            "Комплект прокладок (целый)",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Прокладка головки цилиндра",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Прокладка крышки клапана",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Прокладка стерженя",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Прокладка впускного коллектора",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Прокладка / уплотнительное кольцо выпускного коллектора",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Прокладка картера",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Прокладка масляного поддона",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Герметизация топливной системы",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Герметизация охлаждающей жидкости",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Герметизация в ситеме циркуляции  масла",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Прокладка/комплект прокладок вала",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Цилиндр / Поршень",
                                            10
                                    ),
                                    new Category(
                                            "Головка цилиндра",
                                            Arrays.asList(
                                                    new Category(
                                                            "Прокладка головки цилиндра",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Крышка головки цилиндра / прокладка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Прокладка / уплотнит. кольцо впускного/выпускного коллектора",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Направляющая клапана / прокладка / регулировка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Болт головки блока цилиндра",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Крышка маслозаливной горловины / прокладка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Головка цилиндра",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Сальник вала",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Система подачи воздуха",
                                            Arrays.asList(
                                                    new Category(
                                                            "Воздушный фильтр/корпус воздушного фильтра",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Тросик газа / система тяг и рычагов",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Впускной коллектор/выпускной газопровод",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Дроссельная заслонка / датчик",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Патрубок дроссельной заслонки",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Датчик дроссельной заслонки",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Система нагнетания воздуха",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Охладитель наддувочного воздуха (интеркулер)",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Регулировка нагнетаемого воздуха",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Трубка нагнетаемого воздуха",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Регулирование / управление",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Соединительные элементы / провода",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Механизм газораспределения",
                                            Arrays.asList(
                                                    new Category(
                                                            "Ремень ГРМ / натяжение",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Ремень ГРМ",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Комплект ремней ГРМ",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Ролик натяжителя",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Паразитный / ведущий ролик",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Натяжитель ремня",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Крышка зубчатого ремня",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Цепь привода распредвала / натяжение",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Комплект цели привода распредвала",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Натяжитель цепи",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Шестерни",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Шестерня коленвала",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Распредвал",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Коромысло / балансир",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Штанга толкателя / предохранительная трубка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Клапан / регулировка",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Клапаны / комплектующие",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Приведение в действие клапанов",
                                                                            10
                                                                    )
                                                            )
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Блок-картер",
                                            Arrays.asList(
                                                    new Category(
                                                            "Блок-картер",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Электроника двигателя",
                                            10
                                    ),
                                    new Category(
                                            "Кривошипношатунный механизм",
                                            Arrays.asList(
                                                    new Category(
                                                            "Коленчатый вал",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Коленчатый вал",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Вкладыш подшипника коленвала",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Диск коленвала",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "маслоразбрызгиваюший щиток",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Маховик",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Шатун",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Вкладыш нижней головки шатуна",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Втулка нижней головки шатуна",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Болт/гайка крепления крышки шатуна",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Поршень",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Поршень",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Поршень в сборе",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Комплект поршневых колец",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Сальник / комплект сальников вала",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Система смазки",
                                            Arrays.asList(
                                                    new Category(
                                                            "Масляный фильтр",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Корпус топливного фильтра / прокладка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Масляный радиатор / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Масляный радиатор",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Прокладка",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Масляный поддон / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Масляный поддон",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Прокладка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Пробка сливного отверстия",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Масляный насос / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Масляный насос",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "цепь привода",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Датчик давления масла / клапан",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Указатель уровня масла",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Отстойник масла",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Масла",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Крепление двигателя",
                                            Arrays.asList(
                                                    new Category(
                                                            "Кронштейн двигателя",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Подвеска двигателя",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Система очистки ОГ",
                                            Arrays.asList(
                                                    new Category(
                                                            "Рециркуляция отработанных газов",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Клапан системы рециркуляции ОГ",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Рециркуляция ОГ-регулирование ОГ",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Преобразователь давления",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Клапаны, рециркуляция ОГ",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Нагнетание дополнительного воздуха",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Насосная система дополнительного воздуха",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Насос дополнительного воздуха",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Лямбда-регулирование",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Кожух двигателя",
                                            10
                                    ),
                                    new Category(
                                            "Ременный привод",
                                            Arrays.asList(
                                                    new Category(
                                                            "Поликлиновой  ремень / комплект",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Поликлиновый ремень",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Комплект ручейковых ремней",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Ролик натяжителя",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Паразитный / ведущий ролик",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Натяжная планка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Натяжитель ремня/амортизатор натяжителя",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Ремень ГРМ / комплект",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Ремень ГРМ",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Комплект ремней ГРМ",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Ролик натяжителя",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Паразитный / ведущий ролик",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Натяжитель ремня / успокоитель",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Крышка зубчатого ремня",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Ременный шкив",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Механизм свободного хода генератора",
                                                            10
                                                    )
                                            )
                                    )
                            )
                    ),
                    new Category(
                            "фильтр",
                            Arrays.asList(
                                    new Category(
                                            "Масляный фильтр",
                                            10
                                    ),
                                    new Category(
                                            "Воздушный фильтр",
                                            10
                                    ),
                                    new Category(
                                            "Топливный фильтр",
                                            10
                                    ),
                                    new Category(
                                            "Фильтр салона",
                                            10
                                    ),
                                    new Category(
                                            "Гидравлический фильтр",
                                            10
                                    ),
                                    new Category(
                                            "Комплект фильтра",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Ременный привод",
                            Arrays.asList(
                                    new Category(
                                            "Поликлиновой  ремень / комплект",
                                            Arrays.asList(
                                                    new Category(
                                                            "Поликлиновый ремень",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Комплект ручейковых ремней",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Ролик натяжителя",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Паразитный / ведущий ролик",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Натяжная планка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Натяжитель ремня/амортизатор натяжителя",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Ремень ГРМ / комплект",
                                            Arrays.asList(
                                                    new Category(
                                                            "Ремень ГРМ",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Комплект ремней ГРМ",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Ролик натяжителя",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Паразитный / ведущий ролик",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Натяжитель ремня / успокоитель",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Крышка зубчатого ремня",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Ременный шкив",
                                            10
                                    ),
                                    new Category(
                                            "Механизм свободного хода генератора",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "система подачи топлива",
                            Arrays.asList(
                                    new Category(
                                            "Трубка забора топлива в сборе",
                                            10
                                    ),
                                    new Category(
                                            "Топливный бак / комплектующие",
                                            10
                                    ),
                                    new Category(
                                            "Насос / комплектующие",
                                            Arrays.asList(
                                                    new Category(
                                                            "Топливный насос",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Аксессуары / составляющие",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Клапан",
                                            10
                                    ),
                                    new Category(
                                            "Топливный фильтр/ корпус",
                                            10
                                    ),
                                    new Category(
                                            "Датчик уровня топлива",
                                            10
                                    ),
                                    new Category(
                                            "Датчик давления / выключатель",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Подготовка топливной смеси",
                            Arrays.asList(
                                    new Category(
                                            "Нейтрализация ОГ",
                                            Arrays.asList(
                                                    new Category(
                                                            "Рециркуляция ОГ",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Клапан системы рециркуляции ОГ",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Рециркуляция ОГ-управление ОГ",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Преобразователь давления",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Подача дололнительного воздуха",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Насосная система дополнительного воздуха",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Насос дополнительного воздуха",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Лямбда-регулирование",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Приготовление смеси",
                                            Arrays.asList(
                                                    new Category(
                                                            "Прокладка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Фланец / патрубок / вакуумный трубопровод",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Клапан форсунки / форсунка / шток форсунки / PDE",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Педаль аксел. / газопотенциометр",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Топливопровод / распределение / соединение",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Регул. част. вращ. при хол. ходе / обогащ. при прогр. двиг.",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Датчик контроля массы / объема воздуха",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Выключатель / реле",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Датчик / зонд",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Система карбюратора",
                                            Arrays.asList(
                                                    new Category(
                                                            "Привод / амортизатор / бачок",
                                                            10
                                                    )
                                            )
                                    )
                            )
                    ),
                    new Category(
                            "Система выпуска",
                            Arrays.asList(
                                    new Category(
                                            "Глушитель в сборе",
                                            10
                                    ),
                                    new Category(
                                            "Глушитель",
                                            10
                                    ),
                                    new Category(
                                            "Катализатор",
                                            10
                                    ),
                                    new Category(
                                            "Лямбда-зонд",
                                            10
                                    ),
                                    new Category(
                                            "Коллектор",
                                            10
                                    ),
                                    new Category(
                                            "Насадка",
                                            10
                                    ),
                                    new Category(
                                            "Трубы",
                                            10
                                    ),
                                    new Category(
                                            "нагнетатель",
                                            10
                                    ),
                                    new Category(
                                            "Детали монтажа",
                                            Arrays.asList(
                                                    new Category(
                                                            "Монтажный комплект",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Монтажные элементы",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Прокладка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Хомут",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Резиновое кольцо",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Отбойник",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Резиновые полоски",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Кронштейн",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Зажимная деталь",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Винты / гайки / шайбы",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Втулка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Трубы",
                                                                            10
                                                                    )
                                                            )
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Выпускная заслонка",
                                            10
                                    ),
                                    new Category(
                                            "Датчик / зонд",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Система охлаждения",
                            Arrays.asList(
                                    new Category(
                                            "Поиск артикула по графику",
                                            10
                                    ),
                                    new Category(
                                            "Водяной насос / прокладка",
                                            Arrays.asList(
                                                    new Category(
                                                            "Водяной насос",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Термостат / прокладка",
                                            Arrays.asList(
                                                    new Category(
                                                            "Термостат",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Прокладка",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Водяной / масляный радиатор",
                                            Arrays.asList(
                                                    new Category(
                                                            "Масляный радиатор",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Водяной радиатор",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Радиатор печки",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Расширительный бачок",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Соединительные элементы / провода / фланцы",
                                            Arrays.asList(
                                                    new Category(
                                                            "Соединительные элементы / провода водяного радиатора",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Фланец",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Выключатель / датчик",
                                            10
                                    ),
                                    new Category(
                                            "Реле",
                                            10
                                    ),
                                    new Category(
                                            "Блок управления",
                                            10
                                    ),
                                    new Category(
                                            "Вентилятор",
                                            10
                                    ),
                                    new Category(
                                            "Система воздушного охлаждения",
                                            10
                                    ),
                                    new Category(
                                            "антифриз",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Система сцепления / навесные части",
                            Arrays.asList(
                                    new Category(
                                            "Комплект сцепления",
                                            10
                                    ),
                                    new Category(
                                            "Нажимной диск сцепления",
                                            10
                                    ),
                                    new Category(
                                            "Диск сцепления",
                                            10
                                    ),
                                    new Category(
                                            "Подшипник выключения сцепления / Центральный выключатель",
                                            Arrays.asList(
                                                    new Category(
                                                            "Подшипник выключения сцепления",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Подвижная втулка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Центральный выключатель",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Возвратная вилка",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Система управления сцеплением",
                                            Arrays.asList(
                                                    new Category(
                                                            "Главный цилиндр",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Рабочий цилиндр",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Комплект главного / рабочего цилиндра",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Педаль",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Маховик",
                                            10
                                    ),
                                    new Category(
                                            "Прокладки / комплекты прокладок",
                                            10
                                    ),
                                    new Category(
                                            "Корпус сцепления",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Коробка передач",
                            Arrays.asList(
                                    new Category(
                                            "Поиск артикула по графику",
                                            10
                                    ),
                                    new Category(
                                            "Ступенчатая коробка передач",
                                            Arrays.asList(
                                                    new Category(
                                                            "Прокладки",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Подвеска",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Корпус/составные части",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Управление передач",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Ремкомплекты",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Кольцо синхронизатора",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Масла",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Управление/гидравлика",
                                                            10
                                                    ),
                                                    new Category(
                                                            "радиатор",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Автоматическая коробка передач",
                                            Arrays.asList(
                                                    new Category(
                                                            "Масляный поддон / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Прокладка",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Сальники",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Подвеска",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Корпус/составные части",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Управление/гидравлика",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Ремкомплекты",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Масла",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Датчик",
                                                            10
                                                    ),
                                                    new Category(
                                                            "радиатор",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Тросовый привод",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Комплект запчастей - замена масла",
                                                            10
                                                    )
                                            )
                                    )
                            )
                    ),
                    new Category(
                            "Привод колеса",
                            Arrays.asList(
                                    new Category(
                                            "Приводной вал",
                                            10
                                    ),
                                    new Category(
                                            "Муфта с шипами",
                                            10
                                    ),
                                    new Category(
                                            "Карданный шарнир / комплект",
                                            10
                                    ),
                                    new Category(
                                            "Пыльник",
                                            10
                                    ),
                                    new Category(
                                            "Крепежные элементы / комплектующие",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Главная передача",
                            Arrays.asList(
                                    new Category(
                                            "Дифференциал",
                                            10
                                    ),
                                    new Category(
                                            "Масла",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "тормозная система",
                            Arrays.asList(
                                    new Category(
                                            "Дисковой тормозной механизм",
                                            Arrays.asList(
                                                    new Category(
                                                            "Тормозной диск",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Тормозные колодки",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Комплектующие / составляющие",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Комплект тормозов",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Суппорт диского колесного тормозного механизма",
                                            Arrays.asList(
                                                    new Category(
                                                            "Комплектующие",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Суппорт диского колесного тормозного механизма / -держатель",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Барабанный тормозной механизм",
                                            Arrays.asList(
                                                    new Category(
                                                            "Тормозная колодка / накладка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "стояночный тормоз",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Рычаги / Тросы / Тяги",
                                            10
                                    ),
                                    new Category(
                                            "стояночный тормоз",
                                            10
                                    ),
                                    new Category(
                                            "тормозные шланги",
                                            10
                                    ),
                                    new Category(
                                            "тормозные трубопроводы",
                                            10
                                    ),
                                    new Category(
                                            "усилитель тормоза",
                                            10
                                    ),
                                    new Category(
                                            "главный тормозной цилиндр",
                                            10
                                    ),
                                    new Category(
                                            "тормозная жидкость",
                                            10
                                    ),
                                    new Category(
                                            "Регулировка динамики движения",
                                            10
                                    ),
                                    new Category(
                                            "вакуумный насос",
                                            10
                                    ),
                                    new Category(
                                            "Выключатель фонаря сигнала торможения",
                                            10
                                    ),
                                    new Category(
                                            "тормозная жидкость",
                                            10
                                    ),
                                    new Category(
                                            "Экономичный тормоз",
                                            Arrays.asList(
                                                    new Category(
                                                            "Экономичный тормозной диск",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Комплект экономичных тормозных колодок",
                                                            10
                                                    )
                                            )
                                    )
                            )
                    ),
                    new Category(
                            "Подвеска / амортизация",
                            Arrays.asList(
                                    new Category(
                                            "Подвеска",
                                            10
                                    ),
                                    new Category(
                                            "Амортизатор",
                                            10
                                    ),
                                    new Category(
                                            "Подвеска амортизатора/стойка амортизатора",
                                            10
                                    ),
                                    new Category(
                                            "Ходовая часть в сборе",
                                            10
                                    ),
                                    new Category(
                                            "инструмент для кручения болтов",
                                            10
                                    ),
                                    new Category(
                                            "Стойка амортизатора / амортизатор /-составные части",
                                            Arrays.asList(
                                                    new Category(
                                                            "Стойка амортизатора",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Навесные части",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Масла",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Подвеска оси / система подвески / колеса",
                            Arrays.asList(
                                    new Category(
                                            "Подвеска поперечного рычага",
                                            Arrays.asList(
                                                    new Category(
                                                            "Рычаг (поперечный, диагональный, продольный)",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Подвеска / крепление ходовой части",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Стабилизатор / детали крепежа",
                                            Arrays.asList(
                                                    new Category(
                                                            "Стабилизатор",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Стойка стабилизатора",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Соединительная тяга",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Детали крепежа",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Стойки / тяги",
                                            10
                                    ),
                                    new Category(
                                            "Ступица колеса / установка",
                                            Arrays.asList(
                                                    new Category(
                                                            "Ступица колеса",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Подшипник ступицы колеса",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Шейка оси",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Подвеска, корпус колесного подшипника",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Шарнирные элементы",
                                            Arrays.asList(
                                                    new Category(
                                                            "Шарнир независимой подвески / поворотного рычага",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Подвеска / крепление стойки амортизатора",
                                            10
                                    ),
                                    new Category(
                                            "Поворотный кулак / ремкомплект",
                                            Arrays.asList(
                                                    new Category(
                                                            "Поворотный кулак",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Балка моста / подвеска оси",
                                            Arrays.asList(
                                                    new Category(
                                                            "Балка моста",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Подвеска",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Балка моста/надрамник",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Колесо / крепление колеса",
                                            10
                                    ),
                                    new Category(
                                            "Расширение колеи",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "рулевое управления",
                            Arrays.asList(
                                    new Category(
                                            "Рулевая тяга / составляющие",
                                            Arrays.asList(
                                                    new Category(
                                                            "Рулевая тяга",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Отдельные элементы рулевой тяги",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Ремкомплект",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Гофрированный кожух / прокладки",
                                            10
                                    ),
                                    new Category(
                                            "Шарниры",
                                            10
                                    ),
                                    new Category(
                                            "Подвеска рулевого управления",
                                            10
                                    ),
                                    new Category(
                                            "Фильтр рулевого управления",
                                            10
                                    ),
                                    new Category(
                                            "Рулевой механизм / насос",
                                            10
                                    ),
                                    new Category(
                                            "Руль / комплектующие",
                                            10
                                    ),
                                    new Category(
                                            "Колонка / вал рулевого управления",
                                            10
                                    ),
                                    new Category(
                                            "Шланги / тросики рулевого провода",
                                            10
                                    ),
                                    new Category(
                                            "Датчик угла поворота",
                                            10
                                    ),
                                    new Category(
                                            "Гидравлическое масло расширительного бачка",
                                            10
                                    ),
                                    new Category(
                                            "Масла",
                                            10
                                    ),
                                    new Category(
                                            "Датчик давления масла",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Электрика",
                            Arrays.asList(
                                    new Category(
                                            "Система стартера",
                                            Arrays.asList(
                                                    new Category(
                                                            "Стартер",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Составляющие",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Тяговое реле стартера",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Генератор / составляющие",
                                            Arrays.asList(
                                                    new Category(
                                                            "Генератор",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Регулятор",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Составляющие",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Батарея",
                                            10
                                    ),
                                    new Category(
                                            "Основная фара / комплектующие",
                                            Arrays.asList(
                                                    new Category(
                                                            "Основная фара / вставка",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Регулировка угла наклона фар",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Ксенон",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Лампа накаливания основной фары",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Основная фара комплектующие",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Дополнительная фара/ комплектующие",
                                            Arrays.asList(
                                                    new Category(
                                                            "Противотуманная фара / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Противотуманная фара / вставка",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Противотуманная фара лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фара дальнего света / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания фара дальнего света",
                                                                            10
                                                                    )
                                                            )
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Система освещения / сигнализация",
                                            Arrays.asList(
                                                    new Category(
                                                            "Задний фонарь / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Задний фонарь",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания заднего фонаря",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь сигнала торможения / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "дополнительный стоп-сигнал",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь указателя поворота / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Фонарь указателя поворота",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь освещения номерного знака / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Фонарь освещения номерного знака",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Задняя противотуманная фара / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фара заднего хода / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Стояночный / габаритный огонь / комплектующие",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Стояночный огонь",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Габаритный огонь",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа накаливания",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Внутреннее освещение",
                                                            Arrays.asList(
                                                                    new Category(
                                                                            "Освещение салона",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Освещение багажного отделения",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Лампа для чтения",
                                                                            10
                                                                    ),
                                                                    new Category(
                                                                            "Освещение приборов /",
                                                                            10
                                                                    )
                                                            )
                                                    ),
                                                    new Category(
                                                            "Фонарь, установленный в двери",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Отражатель",
                                            10
                                    ),
                                    new Category(
                                            "Выключатель / реле / блок управления освещения",
                                            Arrays.asList(
                                                    new Category(
                                                            "Выключатель",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Блок управления",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Прерыватель указателей поворота",
                                            10
                                    ),
                                    new Category(
                                            "Звуковой сигнал",
                                            10
                                    ),
                                    new Category(
                                            "Датчики",
                                            10
                                    ),
                                    new Category(
                                            "Многофункциональное реле",
                                            10
                                    ),
                                    new Category(
                                            "Реле",
                                            10
                                    ),
                                    new Category(
                                            "Контрольные приборы",
                                            Arrays.asList(
                                                    new Category(
                                                            "Датчики / переключатели",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Вал спидометра",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Коробка предохранителей / - кронштейн",
                                            10
                                    ),
                                    new Category(
                                            "Приборы управления",
                                            10
                                    ),
                                    new Category(
                                            "Кабельный комплект",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Система зажигания / накаливания",
                            Arrays.asList(
                                    new Category(
                                            "Катушка зажигания / элемент катушки зажигания",
                                            10
                                    ),
                                    new Category(
                                            "Свеча зажигания",
                                            10
                                    ),
                                    new Category(
                                            "Кабель зажигания / элементы замыкания",
                                            10
                                    ),
                                    new Category(
                                            "Усилитель искры в системе зажигания",
                                            10
                                    ),
                                    new Category(
                                            "Генератор импульсов",
                                            10
                                    ),
                                    new Category(
                                            "Блок управления / реле",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Отопление / вентиляция",
                            Arrays.asList(
                                    new Category(
                                            "Фильтр салона",
                                            10
                                    ),
                                    new Category(
                                            "Теплообменник",
                                            10
                                    ),
                                    new Category(
                                            "Двигатель вентилятор",
                                            10
                                    ),
                                    new Category(
                                            "Блок управления",
                                            10
                                    ),
                                    new Category(
                                            "Элементы управления",
                                            10
                                    ),
                                    new Category(
                                            "Шланги / трубки",
                                            10
                                    ),
                                    new Category(
                                            "Клапан/управление",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Кондиционер",
                            Arrays.asList(
                                    new Category(
                                            "Компрессор/детали",
                                            10
                                    ),
                                    new Category(
                                            "Конденсатор",
                                            10
                                    ),
                                    new Category(
                                            "Испаритель",
                                            10
                                    ),
                                    new Category(
                                            "Осушитель",
                                            10
                                    ),
                                    new Category(
                                            "Ремонтный комплект",
                                            10
                                    ),
                                    new Category(
                                            "Клапаны",
                                            10
                                    ),
                                    new Category(
                                            "Датчики",
                                            10
                                    ),
                                    new Category(
                                            "Выключатель",
                                            10
                                    ),
                                    new Category(
                                            "Шланги / провода",
                                            10
                                    ),
                                    new Category(
                                            "Управление / регулирование",
                                            10
                                    ),
                                    new Category(
                                            "Дополнительный резистор",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Детали для сервиса / ТО / ухода",
                            Arrays.asList(
                                    new Category(
                                            "Интервал регулировки",
                                            10
                                    ),
                                    new Category(
                                            "Дополнительные работы",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Прицепное оборудование / комплектующие",
                            Arrays.asList(
                                    new Category(
                                            "Прицепное оборудование",
                                            10
                                    ),
                                    new Category(
                                            "Электрические части",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Оборудование для перевозки",
                            Arrays.asList(
                                    new Category(
                                            "Брус крыши / багажник",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Система очистки фар",
                            10
                    ),
                    new Category(
                            "Система очистки окон",
                            Arrays.asList(
                                    new Category(
                                            "Стеклоочиститель / резина",
                                            10
                                    ),
                                    new Category(
                                            "Двигатель стеклоочистителя",
                                            10
                                    ),
                                    new Category(
                                            "Водяной насос омывателя",
                                            10
                                    ),
                                    new Category(
                                            "Рычаг стеклоочистителя / подвеска",
                                            10
                                    ),
                                    new Category(
                                            "Тяги и рычаги / привод стеклоочистителя",
                                            10
                                    ),
                                    new Category(
                                            "Бачок стеклоочистителя / провода",
                                            10
                                    ),
                                    new Category(
                                            "Распылитель омывателя",
                                            10
                                    ),
                                    new Category(
                                            "Система очистки окон",
                                            10
                                    ),
                                    new Category(
                                            "Выключатель / реле",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Дополнительные удобства",
                            Arrays.asList(
                                    new Category(
                                            "Система помощи при парковке / сист. предупрежд. заднего хода",
                                            10
                                    ),
                                    new Category(
                                            "Подъемное устройство для окон",
                                            10
                                    ),
                                    new Category(
                                            "Система регулировки скорости",
                                            10
                                    ),
                                    new Category(
                                            "Двигатель / реле/выключатель",
                                            Arrays.asList(
                                                    new Category(
                                                            "Стеклоподъемник",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Система регулировки скорости",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Заднее окно",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Сдвигаемая / подъемная панель крыши",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Зеркало",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Открывание топливозаливной крышки",
                                                            10
                                                    ),
                                                    new Category(
                                                            "Центральный замок",
                                                            10
                                                    )
                                            )
                                    ),
                                    new Category(
                                            "Система подогрева двигателя (электрическая)",
                                            10
                                    ),
                                    new Category(
                                            "Насосы",
                                            10
                                    ),
                                    new Category(
                                            "Автономное отопление",
                                            10
                                    ),
                                    new Category(
                                            "Центральный замок",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Информационная / коммуникационная система",
                            Arrays.asList(
                                    new Category(
                                            "Антенны",
                                            10
                                    ),
                                    new Category(
                                            "Коммуникация",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Внутренняя отделка",
                            Arrays.asList(
                                    new Category(
                                            "Панель приборов",
                                            10
                                    ),
                                    new Category(
                                            "Подъемное устройство для окон",
                                            10
                                    ),
                                    new Category(
                                            "Коврики",
                                            10
                                    ),
                                    new Category(
                                            "Резиновый коврик с защитными бортами",
                                            10
                                    ),
                                    new Category(
                                            "Ручки",
                                            10
                                    ),
                                    new Category(
                                            "Подъемный механизм с верхним/нижним приводом",
                                            10
                                    ),
                                    new Category(
                                            "Багажник / помещение для груза",
                                            10
                                    ),
                                    new Category(
                                            "Сидения",
                                            10
                                    ),
                                    new Category(
                                            "Комплектующие",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Система безопасности",
                            Arrays.asList(
                                    new Category(
                                            "Система подушек безопасности",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Замок",
                            Arrays.asList(
                                    new Category(
                                            "Центральный замок",
                                            10
                                    ),
                                    new Category(
                                            "Внешний замок",
                                            10
                                    ),
                                    new Category(
                                            "Внутренний замок",
                                            10
                                    ),
                                    new Category(
                                            "Цилиндр замка / комплект",
                                            10
                                    ),
                                    new Category(
                                            "Ручки",
                                            10
                                    ),
                                    new Category(
                                            "Составляющие",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Комплектующие",
                            Arrays.asList(
                                    new Category(
                                            "Коврики",
                                            10
                                    ),
                                    new Category(
                                            "Резиновый коврик с защитными бортами",
                                            10
                                    ),
                                    new Category(
                                            "Багажник / пространство для груза",
                                            10
                                    )
                            )
                    ),
                    new Category(
                            "Колёса / шины",
                            Arrays.asList(
                                    new Category(
                                            "Комплектующие",
                                            10
                                    )
                            )
                    )
            )
        );

    }

    public List<CategoryDTO> getTree(long carId) {

        category = calculatePercent(carId, category);
        return creatDTOTree(category);

    }

    private List<Category> calculatePercent(long carId, List<Category> category) {

        for (int i = 0; i < category.size(); i++) {

            if (category.get(i).getChild() != null) {

                category.get(i).setChild(calculatePercent(carId, category.get(i).getChild()));

                long partCnt = 0, fillPartCnt = 0;
                for (Category childItem: category.get(i).getChild()) {
                    partCnt += childItem.getPartCnt();
                    fillPartCnt += Math.min(childItem.getPartCnt(), childItem.getFillPartCnt());
                }

                category.get(i).setPartCnt(partCnt);
                category.get(i).setFillPartCnt(fillPartCnt);

                category.get(i).setPercent((int)Math.min(100, Math.ceil(fillPartCnt / (double)partCnt)));

            } else {

                category.get(i).setFillPartCnt(partService.count(carId, category.get(i).getId()));

            }

        }

        return category;

    }

    private List<CategoryDTO> creatDTOTree(List<Category> category) {

        List<CategoryDTO> categoryDTOTree = new ArrayList<CategoryDTO>();

        for(Category categoryItem: category) {

            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(categoryItem.getId());
            categoryDTO.setName(categoryItem.getName());
            categoryDTO.setPercent(categoryItem.getPercent());

            if (categoryItem.getChild() != null)
                categoryDTO.setChild(creatDTOTree(categoryItem.getChild()));

            categoryDTOTree.add(
                categoryDTO
            );

        }

        return categoryDTOTree;

    }

    @Override
    public Category getById(long carId, long id) {

        for (Category categoryItem : category) {
            if (categoryItem.getId() == id)
                return categoryItem;
        }

        for (Category categoryItem : category) {
            if (categoryItem.getId() == id)
                return categoryItem;
        }

        return null;

    }
}
